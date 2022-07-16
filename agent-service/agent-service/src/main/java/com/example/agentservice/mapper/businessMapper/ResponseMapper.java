package com.example.agentservice.mapper.businessMapper;

import java.util.List;

public interface ResponseMapper<Proto, Response> {

    Response toResponse(Proto proto);

    List<Response> toResponseList(List<Proto> protos);
}
