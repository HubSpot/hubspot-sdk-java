// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicNumberPropertyOperationTest {

    @Test
    fun create() {
        val publicNumberPropertyOperation =
            PublicNumberPropertyOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .operationType(PublicNumberPropertyOperation.OperationType.NUMBER)
                .operator("operator")
                .value(0.0)
                .build()

        assertThat(publicNumberPropertyOperation.includeObjectsWithNoValueSet()).isEqualTo(true)
        assertThat(publicNumberPropertyOperation.operationType())
            .isEqualTo(PublicNumberPropertyOperation.OperationType.NUMBER)
        assertThat(publicNumberPropertyOperation.operator()).isEqualTo("operator")
        assertThat(publicNumberPropertyOperation.value()).isEqualTo(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicNumberPropertyOperation =
            PublicNumberPropertyOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .operationType(PublicNumberPropertyOperation.OperationType.NUMBER)
                .operator("operator")
                .value(0.0)
                .build()

        val roundtrippedPublicNumberPropertyOperation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicNumberPropertyOperation),
                jacksonTypeRef<PublicNumberPropertyOperation>(),
            )

        assertThat(roundtrippedPublicNumberPropertyOperation)
            .isEqualTo(publicNumberPropertyOperation)
    }
}
