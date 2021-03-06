package cc.blynk.server.core.protocol.model.messages.appllication;

import cc.blynk.server.core.protocol.model.messages.BinaryMessage;

import static cc.blynk.server.core.protocol.enums.Command.GET_PROJECT_BY_CLONE_CODE;

/**
 * The Blynk Project.
 * Created by Dmitriy Dumanskiy.
 * Created on 2/1/2015.
 */
public class GetProjectByCloneCodeBinaryMessage extends BinaryMessage {

    public GetProjectByCloneCodeBinaryMessage(int messageId, byte[] data) {
        super(messageId, GET_PROJECT_BY_CLONE_CODE, data);
    }

    @Override
    public String toString() {
        return "GetProjectByCloneCodeStringMessage{" + super.toString() + "}";
    }
}
