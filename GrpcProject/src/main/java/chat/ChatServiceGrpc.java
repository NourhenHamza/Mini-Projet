package chat;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: chat.proto")
public final class ChatServiceGrpc {

  private ChatServiceGrpc() {}

  public static final String SERVICE_NAME = "chat.ChatService";

   
  private static volatile io.grpc.MethodDescriptor<chat.Chat.MessageRequest,
      chat.Chat.MessageResponse> getSendMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendMessage",
      requestType = chat.Chat.MessageRequest.class,
      responseType = chat.Chat.MessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<chat.Chat.MessageRequest,
      chat.Chat.MessageResponse> getSendMessageMethod() {
    io.grpc.MethodDescriptor<chat.Chat.MessageRequest, chat.Chat.MessageResponse> getSendMessageMethod;
    if ((getSendMessageMethod = ChatServiceGrpc.getSendMessageMethod) == null) {
      synchronized (ChatServiceGrpc.class) {
        if ((getSendMessageMethod = ChatServiceGrpc.getSendMessageMethod) == null) {
          ChatServiceGrpc.getSendMessageMethod = getSendMessageMethod = 
              io.grpc.MethodDescriptor.<chat.Chat.MessageRequest, chat.Chat.MessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chat.ChatService", "SendMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  chat.Chat.MessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  chat.Chat.MessageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChatServiceMethodDescriptorSupplier("SendMessage"))
                  .build();
          }
        }
     }
     return getSendMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<chat.Chat.UserRequest,
      chat.Chat.MessagesResponse> getGetMessagesForUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMessagesForUser",
      requestType = chat.Chat.UserRequest.class,
      responseType = chat.Chat.MessagesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<chat.Chat.UserRequest,
      chat.Chat.MessagesResponse> getGetMessagesForUserMethod() {
    io.grpc.MethodDescriptor<chat.Chat.UserRequest, chat.Chat.MessagesResponse> getGetMessagesForUserMethod;
    if ((getGetMessagesForUserMethod = ChatServiceGrpc.getGetMessagesForUserMethod) == null) {
      synchronized (ChatServiceGrpc.class) {
        if ((getGetMessagesForUserMethod = ChatServiceGrpc.getGetMessagesForUserMethod) == null) {
          ChatServiceGrpc.getGetMessagesForUserMethod = getGetMessagesForUserMethod = 
              io.grpc.MethodDescriptor.<chat.Chat.UserRequest, chat.Chat.MessagesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "chat.ChatService", "GetMessagesForUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  chat.Chat.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  chat.Chat.MessagesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChatServiceMethodDescriptorSupplier("GetMessagesForUser"))
                  .build();
          }
        }
     }
     return getGetMessagesForUserMethod;
  }
 
  public static ChatServiceStub newStub(io.grpc.Channel channel) {
    return new ChatServiceStub(channel);
  }

   
  public static ChatServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ChatServiceBlockingStub(channel);
  }

  
  public static ChatServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ChatServiceFutureStub(channel);
  }

   
  public static abstract class ChatServiceImplBase implements io.grpc.BindableService {

     
    public void sendMessage(chat.Chat.MessageRequest request,
        io.grpc.stub.StreamObserver<chat.Chat.MessageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendMessageMethod(), responseObserver);
    }
 
    public void getMessagesForUser(chat.Chat.UserRequest request,
        io.grpc.stub.StreamObserver<chat.Chat.MessagesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMessagesForUserMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendMessageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                chat.Chat.MessageRequest,
                chat.Chat.MessageResponse>(
                  this, METHODID_SEND_MESSAGE)))
          .addMethod(
            getGetMessagesForUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                chat.Chat.UserRequest,
                chat.Chat.MessagesResponse>(
                  this, METHODID_GET_MESSAGES_FOR_USER)))
          .build();
    }
  }

   
  public static final class ChatServiceStub extends io.grpc.stub.AbstractStub<ChatServiceStub> {
    private ChatServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChatServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChatServiceStub(channel, callOptions);
    }

    
    public void sendMessage(chat.Chat.MessageRequest request,
        io.grpc.stub.StreamObserver<chat.Chat.MessageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendMessageMethod(), getCallOptions()), request, responseObserver);
    }

     
    public void getMessagesForUser(chat.Chat.UserRequest request,
        io.grpc.stub.StreamObserver<chat.Chat.MessagesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMessagesForUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

   
  public static final class ChatServiceBlockingStub extends io.grpc.stub.AbstractStub<ChatServiceBlockingStub> {
    private ChatServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChatServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChatServiceBlockingStub(channel, callOptions);
    }
 
    public chat.Chat.MessageResponse sendMessage(chat.Chat.MessageRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendMessageMethod(), getCallOptions(), request);
    }

     
    public chat.Chat.MessagesResponse getMessagesForUser(chat.Chat.UserRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMessagesForUserMethod(), getCallOptions(), request);
    }
  }

   
  public static final class ChatServiceFutureStub extends io.grpc.stub.AbstractStub<ChatServiceFutureStub> {
    private ChatServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChatServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChatServiceFutureStub(channel, callOptions);
    }

     
    public com.google.common.util.concurrent.ListenableFuture<chat.Chat.MessageResponse> sendMessage(
        chat.Chat.MessageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendMessageMethod(), getCallOptions()), request);
    }

     
    public com.google.common.util.concurrent.ListenableFuture<chat.Chat.MessagesResponse> getMessagesForUser(
        chat.Chat.UserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMessagesForUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_MESSAGE = 0;
  private static final int METHODID_GET_MESSAGES_FOR_USER = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ChatServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ChatServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_MESSAGE:
          serviceImpl.sendMessage((chat.Chat.MessageRequest) request,
              (io.grpc.stub.StreamObserver<chat.Chat.MessageResponse>) responseObserver);
          break;
        case METHODID_GET_MESSAGES_FOR_USER:
          serviceImpl.getMessagesForUser((chat.Chat.UserRequest) request,
              (io.grpc.stub.StreamObserver<chat.Chat.MessagesResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ChatServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ChatServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return chat.Chat.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ChatService");
    }
  }

  private static final class ChatServiceFileDescriptorSupplier
      extends ChatServiceBaseDescriptorSupplier {
    ChatServiceFileDescriptorSupplier() {}
  }

  private static final class ChatServiceMethodDescriptorSupplier
      extends ChatServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ChatServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ChatServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ChatServiceFileDescriptorSupplier())
              .addMethod(getSendMessageMethod())
              .addMethod(getGetMessagesForUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
