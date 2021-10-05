import React from "react";
import { Route, Redirect } from "react-router-dom";

const LoginHide = ({ render: Component, ...rest }) => {
  return (
    <Route
      {...rest}
      render={props => {
        if (localStorage.getItem("token")) {
            return <Redirect to="/" />;
        } else {
          return <Component {...props} />;

        }
      }}
    />
  );
};

export default LoginHide;