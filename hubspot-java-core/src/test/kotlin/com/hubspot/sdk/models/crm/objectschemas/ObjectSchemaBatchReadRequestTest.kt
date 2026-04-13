// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.objectschemas

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectSchemaBatchReadRequestTest {

    @Test
    fun create() {
        val objectSchemaBatchReadRequest =
            ObjectSchemaBatchReadRequest.builder()
                .includeAssociationDefinitions(true)
                .includeAuditMetadata(true)
                .includePropertyDefinitions(true)
                .addInput("string")
                .build()

        assertThat(objectSchemaBatchReadRequest.includeAssociationDefinitions()).isEqualTo(true)
        assertThat(objectSchemaBatchReadRequest.includeAuditMetadata()).isEqualTo(true)
        assertThat(objectSchemaBatchReadRequest.includePropertyDefinitions()).isEqualTo(true)
        assertThat(objectSchemaBatchReadRequest.inputs()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val objectSchemaBatchReadRequest =
            ObjectSchemaBatchReadRequest.builder()
                .includeAssociationDefinitions(true)
                .includeAuditMetadata(true)
                .includePropertyDefinitions(true)
                .addInput("string")
                .build()

        val roundtrippedObjectSchemaBatchReadRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(objectSchemaBatchReadRequest),
                jacksonTypeRef<ObjectSchemaBatchReadRequest>(),
            )

        assertThat(roundtrippedObjectSchemaBatchReadRequest).isEqualTo(objectSchemaBatchReadRequest)
    }
}
