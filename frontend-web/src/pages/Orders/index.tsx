import { useEffect, useState } from "react";
import { fetchProducts } from "../../services/axios";
import { OrderLocationdata, Product } from "./types";
import OrderLocation from "./OrderLocation";
import ProductList from "./ProductsList";
import StepsHeader from "./StepsHeader";
import "./styles.css";

const Orders = () => {
  const [products, setProducts] = useState<Product[]>([]);
  const [orderLocation, setOrderLocation] = useState<OrderLocationdata>();
  console.log(products);

  useEffect(() => {
    fetchProducts()
      .then((response) => setProducts(response.data))
      .catch((error) => console.log(error));
  }, []);

  return (
    <div className="orders-container">
      <StepsHeader />
      <ProductList products={products} />
      <OrderLocation
        onChangeLocation={(location) => setOrderLocation(location)}
      />
    </div>
  );
};

export default Orders;
