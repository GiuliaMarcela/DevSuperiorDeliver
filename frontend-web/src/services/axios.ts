import axios from "axios";
import { OrderPayload } from "../pages/Orders/types";

const base_URL = process.env.REACT_APP_API_URL;
const mapboxToken = process.env.REACT_APP_ACCESS_TOKEN_MAP_BOX;

export const fetchProducts = () => {
  return axios(`${base_URL}/products`);
};

export const fetchLocalMapBox = (local: string) => {
  return axios(
    `https://api.mapbox.com/geocoding/v5/mapbox.places/${local}.json?access_token=${mapboxToken}`
  );
};

export function saveOrder(payload: OrderPayload) {
  return axios.post(`${base_URL}/orders`, payload);
}
