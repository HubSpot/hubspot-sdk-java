// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicStringPropertyOperationTest {

    @Test
    fun create() {
        val publicStringPropertyOperation =
            PublicStringPropertyOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .operationType(PublicStringPropertyOperation.OperationType.STRING)
                .operator("operator")
                .value("value")
                .build()

        assertThat(publicStringPropertyOperation.includeObjectsWithNoValueSet()).isEqualTo(true)
        assertThat(publicStringPropertyOperation.operationType())
            .isEqualTo(PublicStringPropertyOperation.OperationType.STRING)
        assertThat(publicStringPropertyOperation.operator()).isEqualTo("operator")
        assertThat(publicStringPropertyOperation.value()).isEqualTo("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicStringPropertyOperation =
            PublicStringPropertyOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .operationType(PublicStringPropertyOperation.OperationType.STRING)
                .operator("operator")
                .value("value")
                .build()

        val roundtrippedPublicStringPropertyOperation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicStringPropertyOperation),
                jacksonTypeRef<PublicStringPropertyOperation>(),
            )

        assertThat(roundtrippedPublicStringPropertyOperation)
            .isEqualTo(publicStringPropertyOperation)
    }
}
