import React, { Component } from 'react'
import Get from "../api/Get";


class Login extends Component{
    constructor(props) {
        super(props)
        this.state = {
            email: '',
            password: ''
        }
        this.changeEmailHandler = this.changeEmailHandler.bind(this);
        this.changePasswordHandler = this.changePasswordHandler.bind(this);
        this.checkUser = this.checkUser.bind(this);
    }



    // checkUser = (hndl) => {
    //     hndl.preventDefault();
    //     let member = { memberID: this.state.memberID, name: this.state.name, email: this.state.email, phoneNumb: this.state.phoneNumb, address: this.state.address, password: this.state.password };
    //     postFormData(member)
    // }
    

    changeEmailHandler = (event) => {
        this.setState({ email: event.target.value });
    }
    changePasswordHandler = (event) => {
        this.setState({ password: event.target.value });
    }

    render() {
        return (
            <div>
                <div className="container">
                    <div className="row">
                        <div className="card col-md-6 offset-md-3 offset-md-3">
                            <h3 className="text-center">Sign In</h3>
                            <div className="card-body">
                                <form>
                                    <div className="form=group">
                                        <label> Email : </label>
                                        <input placeholder="Email" name="email" className="form-control"
                                            value={this.state.email} onChange={this.changeEmailHandler} />
                                    </div>
                                    <div className="form=group">
                                        <label> Password : </label>
                                        <input placeholder="Password" name="password" className="form-control"
                                            value={this.state.password} onChange={this.changePasswordHandler} />
                                    </div>
                                    <button className="btn btn-success" onClick={this.checkUser}>SignIn</button>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        )
    }
}
export default Login