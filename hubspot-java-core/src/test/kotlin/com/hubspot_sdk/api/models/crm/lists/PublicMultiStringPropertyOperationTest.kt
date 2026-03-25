// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicMultiStringPropertyOperationTest {

    @Test
    fun create() {
        val publicMultiStringPropertyOperation =
            PublicMultiStringPropertyOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .operationType(PublicMultiStringPropertyOperation.OperationType.MULTISTRING)
                .operator("operator")
                .addValue("string")
                .build()

        assertThat(publicMultiStringPropertyOperation.includeObjectsWithNoValueSet())
            .isEqualTo(true)
        assertThat(publicMultiStringPropertyOperation.operationType())
            .isEqualTo(PublicMultiStringPropertyOperation.OperationType.MULTISTRING)
        assertThat(publicMultiStringPropertyOperation.operator()).isEqualTo("operator")
        assertThat(publicMultiStringPropertyOperation.values()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicMultiStringPropertyOperation =
            PublicMultiStringPropertyOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .operationType(PublicMultiStringPropertyOperation.OperationType.MULTISTRING)
                .operator("operator")
                .addValue("string")
                .build()

        val roundtrippedPublicMultiStringPropertyOperation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicMultiStringPropertyOperation),
                jacksonTypeRef<PublicMultiStringPropertyOperation>(),
            )

        assertThat(roundtrippedPublicMultiStringPropertyOperation)
            .isEqualTo(publicMultiStringPropertyOperation)
    }
}
