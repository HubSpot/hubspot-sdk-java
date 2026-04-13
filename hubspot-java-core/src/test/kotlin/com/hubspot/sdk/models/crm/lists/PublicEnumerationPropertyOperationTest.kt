// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicEnumerationPropertyOperationTest {

    @Test
    fun create() {
        val publicEnumerationPropertyOperation =
            PublicEnumerationPropertyOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .operationType(PublicEnumerationPropertyOperation.OperationType.ENUMERATION)
                .operator("operator")
                .addValue("string")
                .build()

        assertThat(publicEnumerationPropertyOperation.includeObjectsWithNoValueSet())
            .isEqualTo(true)
        assertThat(publicEnumerationPropertyOperation.operationType())
            .isEqualTo(PublicEnumerationPropertyOperation.OperationType.ENUMERATION)
        assertThat(publicEnumerationPropertyOperation.operator()).isEqualTo("operator")
        assertThat(publicEnumerationPropertyOperation.values()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicEnumerationPropertyOperation =
            PublicEnumerationPropertyOperation.builder()
                .includeObjectsWithNoValueSet(true)
                .operationType(PublicEnumerationPropertyOperation.OperationType.ENUMERATION)
                .operator("operator")
                .addValue("string")
                .build()

        val roundtrippedPublicEnumerationPropertyOperation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicEnumerationPropertyOperation),
                jacksonTypeRef<PublicEnumerationPropertyOperation>(),
            )

        assertThat(roundtrippedPublicEnumerationPropertyOperation)
            .isEqualTo(publicEnumerationPropertyOperation)
    }
}
