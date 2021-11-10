import React,{Component} from "react";
import axios from "axios";
import { Card, Button } from "react-bootstrap";
import '../styles/Card.css'

class CPUList extends Component{
    
    
    constructor(props) {
        super(props)
        this.state = { 
             products : []
        }
    }    
    
    
    // componentDidMount() { 
    //     axios.get('http://localhost:8080/CPU')
    //     .then(response =>{
    //         this.setState({
    //             products: response.data
    //         })
    //         console.log(response.data)
    //     })
    // }
    

    render() { 
        const {products} = this.state
        return(
            <div className = "wrapper">
                {
                    <Card className="card">
                    <Card.Body>
                      <Card.Title>Card Title</Card.Title>
                      <Card.Text>
                        Some quick example text to build on the card title and make up the bulk of
                        the card's content.
                      </Card.Text>
                      <Button variant="primary">Go somewhere</Button>
                    </Card.Body>
                  </Card>
                }
            </div>
        )
    }
}


export default CPUList



