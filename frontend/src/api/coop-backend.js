import axios from "axios";

const checkOnline = axios.create({
  baseURL: "http://localhost:9020",
});

const buscarCoops = axios.create({
  baseURL: "http://localhost:9020/coop",
});

export { checkOnline, buscarCoops };
