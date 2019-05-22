import spock.lang.Specification

class HelloWorldTest extends Specification {

    def "should return proper String"() {
        when:
        HelloWorld hw = new HelloWorld()

        then:
        hw.hello == "Hello World!!"
    }
}
