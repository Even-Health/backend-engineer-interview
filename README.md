# backend-engineer-interview

```
Caused by: org.springframework.http.converter.HttpMessageConversionException: Type definition error: [simple type, class com.evenhealth.cabana.infrastructure.clevertap.model.event.SignupCompletedEvent]; nested exception is com.fasterxml.jackson.databind.exc.InvalidDefinitionException: No serializer found for class com.evenhealth.cabana.infrastructure.clevertap.model.event.SignupCompletedEvent and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS) (through reference chain: com.evenhealth.cabana.infrastructure.clevertap.model.CleverTapWrapper["d"]->java.util.ImmutableCollections$List12[0]->com.evenhealth.cabana.infrastructure.clevertap.model.event.EventPayload["evtData"])
at org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter.writeInternal(AbstractJackson2HttpMessageConverter.java:462) ~[spring-web-5.3.22.jar!/:5.3.22]
at org.springframework.http.converter.AbstractGenericHttpMessageConverter.write(AbstractGenericHttpMessageConverter.java:104) ~[spring-web-5.3.22.jar!/:5.3.22]
at org.springframework.cloud.openfeign.support.SpringEncoder.checkAndWrite(SpringEncoder.java:217) ~[spring-cloud-openfeign-core-3.1.3.jar!/:3.1.3]
at org.springframework.cloud.openfeign.support.SpringEncoder.encodeWithMessageConverter(SpringEncoder.java:146) ~[spring-cloud-openfeign-core-3.1.3.jar!/:3.1.3]
... 59 common frames omitted
Caused by: com.fasterxml.jackson.databind.exc.InvalidDefinitionException: No serializer found for class com.evenhealth.cabana.infrastructure.clevertap.model.event.SignupCompletedEvent and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS) (through reference chain: com.evenhealth.cabana.infrastructure.clevertap.model.CleverTapWrapper["d"]->java.util.ImmutableCollections$List12[0]->com.evenhealth.cabana.infrastructure.clevertap.model.event.EventPayload["evtData"])
at com.fasterxml.jackson.databind.exc.InvalidDefinitionException.from(InvalidDefinitionException.java:77) ~[jackson-databind-2.13.3.jar!/:2.13.3]
at com.fasterxml.jackson.databind.SerializerProvider.reportBadDefinition(SerializerProvider.java:1300) ~[jackson-databind-2.13.3.jar!/:2.13.3]
at com.fasterxml.jackson.databind.DatabindContext.reportBadDefinition(DatabindContext.java:400) ~[jackson-databind-2.13.3.jar!/:2.13.3]
at com.fasterxml.jackson.databind.ser.impl.UnknownSerializer.failForEmpty(UnknownSerializer.java:46) ~[jackson-databind-2.13.3.jar!/:2.13.3]
at com.fasterxml.jackson.databind.ser.impl.UnknownSerializer.serialize(UnknownSerializer.java:29) ~[jackson-databind-2.13.3.jar!/:2.13.3]
at com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsField(BeanPropertyWriter.java:728) ~[jackson-databind-2.13.3.jar!/:2.13.3]
at com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFields(BeanSerializerBase.java:774) ~[jackson-databind-2.13.3.jar!/:2.13.3]
at com.fasterxml.jackson.databind.ser.BeanSerializer.serialize(BeanSerializer.java:178) ~[jackson-databind-2.13.3.jar!/:2.13.3]
at com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer.serializeContents(IndexedListSerializer.java:119) ~[jackson-databind-2.13.3.jar!/:2.13.3]
at com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer.serialize(IndexedListSerializer.java:79) ~[jackson-databind-2.13.3.jar!/:2.13.3]
at com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer.serialize(IndexedListSerializer.java:18) ~[jackson-databind-2.13.3.jar!/:2.13.3]
at com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsField(BeanPropertyWriter.java:728) ~[jackson-databind-2.13.3.jar!/:2.13.3]
at com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFields(BeanSerializerBase.java:774) ~[jackson-databind-2.13.3.jar!/:2.13.3]
at com.fasterxml.jackson.databind.ser.BeanSerializer.serialize(BeanSerializer.java:178) ~[jackson-databind-2.13.3.jar!/:2.13.3]
at com.fasterxml.jackson.databind.ser.DefaultSerializerProvider._serialize(DefaultSerializerProvider.java:480) ~[jackson-databind-2.13.3.jar!/:2.13.3]
at com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.serializeValue(DefaultSerializerProvider.java:319) ~[jackson-databind-2.13.3.jar!/:2.13.3]
at com.fasterxml.jackson.databind.ObjectWriter$Prefetch.serialize(ObjectWriter.java:1518) ~[jackson-databind-2.13.3.jar!/:2.13.3]
at com.fasterxml.jackson.databind.ObjectWriter.writeValue(ObjectWriter.java:1007) ~[jackson-databind-2.13.3.jar!/:2.13.3]
at org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter.writeInternal(AbstractJackson2HttpMessageConverter.java:456) ~[spring-web-5.3.22.jar!/:5.3.22]
... 62 common frames omitted
```
