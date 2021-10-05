import axios from "axios";

const member_API_URL = "http://localhost:8080/user";
class Get {
    getUser(){
        return axios.get(member_API_URL);
    }
}
export default new Get()