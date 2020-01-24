public class poplulation {

        public static void main(String[] args) {

            int time = 3600 * 24 * 365;   //Convert year in second
            int born = time / 7;  // number of born in 1 year per second
            int death = time / 13;  // number of death in 1 year per second
            int immigrant = time / 45;  // Immigrant in 1 year

            int populationNumber = 312032486;
            int population = born + immigrant - death;

            for (int i = 1; i <= 5; i++) {
                populationNumber = populationNumber + population;  // Calculate total population
                System.out.println(i + " year population is : " + populationNumber);
            }
        }
    }
