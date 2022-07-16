package com.example.agentservice.mapper.recordMapper;

import java.util.List;

public interface ProtoMapper<Request, Proto> {

    Proto toProto(Request request);

    List<Proto> toProtoList(List<Request> requests);
}
