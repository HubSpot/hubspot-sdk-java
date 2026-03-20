// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchReadInputSimplePublicObjectIdTest {

    @Test
    fun create() {
        val batchReadInputSimplePublicObjectId =
            BatchReadInputSimplePublicObjectId.builder()
                .addInput(SimplePublicObjectId.builder().id("430001").build())
                .addProperty("string")
                .addPropertiesWithHistory("string")
                .idProperty("idProperty")
                .build()

        assertThat(batchReadInputSimplePublicObjectId.inputs())
            .containsExactly(SimplePublicObjectId.builder().id("430001").build())
        assertThat(batchReadInputSimplePublicObjectId.properties()).containsExactly("string")
        assertThat(batchReadInputSimplePublicObjectId.propertiesWithHistory())
            .containsExactly("string")
        assertThat(batchReadInputSimplePublicObjectId.idProperty()).contains("idProperty")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchReadInputSimplePublicObjectId =
            BatchReadInputSimplePublicObjectId.builder()
                .addInput(SimplePublicObjectId.builder().id("430001").build())
                .addProperty("string")
                .addPropertiesWithHistory("string")
                .idProperty("idProperty")
                .build()

        val roundtrippedBatchReadInputSimplePublicObjectId =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchReadInputSimplePublicObjectId),
                jacksonTypeRef<BatchReadInputSimplePublicObjectId>(),
            )

        assertThat(roundtrippedBatchReadInputSimplePublicObjectId)
            .isEqualTo(batchReadInputSimplePublicObjectId)
    }
}
