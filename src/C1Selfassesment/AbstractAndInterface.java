package C1Selfassesment;

public class AbstractAndInterface {}
abstract class Phone1 extends AbstractAndInterface { }
abstract class Phone2 extends AbstractAndInterface { public void doIt(int x) {}}
abstract class Phone3 extends AbstractAndInterface implements Device{ public void doStuff() { } }
interface Device {public void doIt();}