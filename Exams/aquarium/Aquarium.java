package aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
        //•	name: String
        //•	capacity: int
        //•	size: int - the volume of the pool
        // List<Fish> - fishInPool or Set
        private String name;
        private int capacity;
        private int size;
        private List<Fish> fishInPool;

        public Aquarium(String name, int capacity, int size) {
                this.name = name;
                this.capacity = capacity;
                this.size = size;
                this.fishInPool = new ArrayList<>();

        }

        public String getName() {
                return name;
        }

        public int getCapacity() {
                return capacity;
        }

        public int getSize() {
                return size;
        }

        public int getFishInPool(){
                return this.fishInPool.size();
        }
        public void add(Fish fish){
                if (this.fishInPool.size() < this.capacity && !this.fishInPool.contains(fish)){
                        this.fishInPool.add(fish);

                }
        }
        public boolean remove(String name){
                for (Fish element : this.fishInPool) {
                        if (element.getName().equals(name)){
                                this.fishInPool.remove(element);
                                return true;
                        }

                }
                return false;


        }
        public Fish findFish(String name){
                for (Fish element : this.fishInPool) {
                        if (element.getName().equals(name)){
                                return element;
                        }

                }
                return null;

        }
        public String report(){
                StringBuilder sb = new StringBuilder();
                sb.append(String.format("Aquarium: %s ^ Size: %d",this.name,this.size));
                sb.append(System.lineSeparator());
                for (Fish element : this.fishInPool) {
                        sb.append(element);
                        sb.append(System.lineSeparator());

                }
                return sb.toString().trim();
        }
}

