import "./App.css";
import "../node_modules/bootstrap/dist/css/bootstrap.min.css";
import Header from "./layout/Header";
import Home from "./pages/Home";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import AddBook from "./books/AddBook";
import EditBook from "./books/EditBook";
import ViewBook from "./books/ViewBook";
import Footer from "./layout/Footer";

function App() {
  return (
    <div className="App">
      <Router>
        <Header />
        <Routes>
          <Route exact path="/" element={<Home />} />
          <Route exact path="/addbooks" element={<AddBook />} />
          <Route exact path="/editbooks/:id" element={<EditBook />} />
          <Route exact path="/viewbooks/:id" element={<ViewBook />} />
        </Routes>
        <Footer />
      </Router>
    </div>
  );
}

export default App;
