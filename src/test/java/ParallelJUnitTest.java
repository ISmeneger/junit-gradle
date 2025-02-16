import org.junit.jupiter.api.Test;

class ParallelJUnitTest {

    /*
    FirstParallelUnitTest first() start => Test worker
    FirstParallelUnitTest first() end => Test worker
    FirstParallelUnitTest second() start => Test worker
    FirstParallelUnitTest second() end => Test worker

    FirstParallelUnitTest second() start => ForkJoinPool-1-worker-1
    FirstParallelUnitTest first() start => ForkJoinPool-1-worker-2
    FirstParallelUnitTest first() end => ForkJoinPool-1-worker-2
    FirstParallelUnitTest second() end => ForkJoinPool-1-worker-1
     */

    @Test
    void firstTest() throws Exception{
        System.out.println("FirstParallelUnitTest first() start => " + Thread.currentThread().getName());
        Thread.sleep(500);
        System.out.println("FirstParallelUnitTest first() end => " + Thread.currentThread().getName());
    }

    @Test
    void secondTest() throws Exception{
        System.out.println("FirstParallelUnitTest second() start => " + Thread.currentThread().getName());
        Thread.sleep(500);
        System.out.println("FirstParallelUnitTest second() end => " + Thread.currentThread().getName());
    }
}
