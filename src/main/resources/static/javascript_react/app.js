 class Employee extends React.Component {
          constructor(props) {
            super(props);
          }
          render() {
          const {employee} = this.props;
            return (
              <tr>
                <td>{employee.name}</td><td>{employee.age}</td><td>{employee.years}</td>
              </tr>
            );
          }
        };

        class EmployeeTable extends React.Component {


          loadEmployeesFromServer() {
            var self = this;
            $.ajax({
              url: "http://localhost:8080/api/employees"
            }).then(function (data) {
              self.setState({
                  isLoaded: true,
                  employees: data._embedded.employees
              });
            });
          }


          componentDidMount() {
            this.loadEmployeesFromServer();

            /*
            fetch("http://localhost:8080/api/employees")
            .then(res => res.json())
            .then(
                    (result) => {
                    console.log(result);
                      this.setState({
                        isLoaded: true,
                        employees: result.employee
                      });
                    },
                    // Note: it's important to handle errors here
                    // instead of a catch() block so that we don't swallow
                    // exceptions from actual bugs in components.
                    (error) => {
                      this.setState({
                        isLoaded: true,
                        error
                      });
                    }
                  )
              */
          }


          constructor(props) {
            super(props);
            this.state = {
                  error: null,
                  isLoaded: false,
                  employees: []
                };
          }
          render() {


          const { error, isLoaded, employees } = this.state;
            if (error) {
                  return <div>Error: {error.message}</div>;
                } else if (!isLoaded) {
                  return <div>Loading...</div>;
                } else {
                  return (
                    <ul>
                      {employees.map(employee => (
                        <li key={employee.name}>
                          {employee.name} {employee.age}
                        </li>
                      ))}
                    </ul>
                  );
                }
              }
            };

/*
          var rows = [];
          this.state.employees.forEach(function(employee) {
          rows.push(<Employee employee={employee} key={employee.name} />);
            });
            return (
            <div className='container'>
                <table className='table table-striped'>
                   <thead>
                     <tr>
                        <th>Name</th><th>Age</th><th>Years</th>
                      </tr>
                    </thead>
                  <tbody>{rows}</tbody>
                </table>
            </div>
            );
          }
        };
        */

/*
    var EMPLOYEES = [
      {name: 'Joe Biden', age: 45, years: 5},
      {name: 'President Obama', age: 54, years: 8},
      {name: 'Crystal Mac', age: 34, years: 12},
      {name: 'James Henry', age: 33, years: 2}
    ];
*/

    ReactDOM.render(
      <EmployeeTable />, document.getElementById('root')
    );
