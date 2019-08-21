import de.re.easymodbus.server.*;

import java.io.IOException;

import static com.sun.tools.classfile.Attribute.Exceptions;

public class IntroComPLC {
    public static void main(String[] args)
    {
        ModbusServer modbusServer = new ModbusServer();
        modbusServer.setPort(1522);//Note that Standard Port for Modbus TCP communication is 502
        modbusServer.coils[1] = true;
        modbusServer.holdingRegisters[1] = 1234;
        try
        {
            modbusServer.Listen();
        }
        catch (java.io.IOException j)
        {
        }
    }
}
