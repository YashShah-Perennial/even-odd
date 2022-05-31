public class Even_odd
{
    int array []={1,2,3,4,5}; // initializing array
        int loop;

        public void Even_position()
        {
            for (loop=0;loop< array.length;loop++)// loop for travelling
            {
                if (loop%2==0)// logic of even
                {
                    System.out.println(loop + "  "+array[loop]);
                }
            }
        }

        public static void main(String[] args) {
        Even_odd object=new Even_odd();
        object.Even_position();
    }

    }

