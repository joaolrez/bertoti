import java.util.List;

    public abstract class Pizzaria implements Subject {
        private List<Observer> observer;
        private List<Pizza> pizza;
        private List<Sobremesa> sobremesa;
        

        public void registrarObserver(Observer observador){
            this.observer.add(observador);
        }   

        public void notifyObservers(List<Pizza> l){
            this.observer.stream().forEach(ob -> {
              System.out.println("Sobremesa adicionada:");
              l.stream().forEach(p -> {
                System.out.println(". " + p.getSabor());
            });
        });
      }
      
        public void adicionarSobremesa(Sobremesa sobremesa){
            this.sobremesa.add(sobremesa);
        }

        public Sobremesa retirarSobremesa(String sobremesa){
            return this.sobremesa.stream().filter(r -> r.getNome().equalsIgnoreCase(sobremesa)).findFirst().orElse(null);
        }

        public void adicionarSaborPizza(Pizza pizza){
            this.pizza.add(pizza);
        }

        public Pizza retirarSaborPizza(String saborPizza){
            return this.pizza.stream().filter(r -> r.getSabor().equalsIgnoreCase(saborPizza)).findFirst().orElse(null);
        }
    }
