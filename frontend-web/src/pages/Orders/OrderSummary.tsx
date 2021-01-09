import { formatPrice } from "./helpers";

type Props = {
  amount: number;
  totalPrice: number;
  onSubmit: () => void;
};

const OrderSummary = ({ amount, totalPrice, onSubmit }: Props) => {
  return (
    <div className="order-summary-container">
      <div className="order-summary-content">
        <div>
          <span className="amount-selected-container">
            <b className="amount-selected">{amount}</b> PEDIDOS SELECIONADOS
          </span>
          <span className="order-summary-total">
            <b className="amount-selected">{formatPrice(totalPrice)}</b>
            VALOR TOTAL
          </span>
        </div>
        <button className="order-summary-make-order" onClick={onSubmit}>
          FAZER PEDIDO
        </button>
      </div>
    </div>
  );
};

export default OrderSummary;
