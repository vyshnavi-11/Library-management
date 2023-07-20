import React from "react";
import { Link } from "react-router-dom";

export default function Navbar() {
  return (
    <div>
      <nav className="navbar navbar-expand-lg navbar-dark bg-primary">
        <div className="container-fluid">
          <Link className="navbar-brand" to="/">
            Library Management Application
          </Link>
         

          <Link className="btn btn-outline-light" to="/addbooks">
            Add Book
          </Link>
        </div>
      </nav>
    </div>
  );
}