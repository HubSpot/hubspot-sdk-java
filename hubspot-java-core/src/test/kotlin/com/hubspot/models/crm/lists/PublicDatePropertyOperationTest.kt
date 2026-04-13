// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicDatePropertyOperationTest {

    @Test
    fun create() {
        val publicDatePropertyOperation =
            PublicDatePropertyOperation.builder()
                .day(0)
                .includeObjectsWithNoValueSet(true)
                .month("month")
                .operationType(PublicDatePropertyOperation.OperationType.DATE)
                .operator("operator")
                .year(0)
                .build()

        assertThat(publicDatePropertyOperation.day()).isEqualTo(0)
        assertThat(publicDatePropertyOperation.includeObjectsWithNoValueSet()).isEqualTo(true)
        assertThat(publicDatePropertyOperation.month()).isEqualTo("month")
        assertThat(publicDatePropertyOperation.operationType())
            .isEqualTo(PublicDatePropertyOperation.OperationType.DATE)
        assertThat(publicDatePropertyOperation.operator()).isEqualTo("operator")
        assertThat(publicDatePropertyOperation.year()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicDatePropertyOperation =
            PublicDatePropertyOperation.builder()
                .day(0)
                .includeObjectsWithNoValueSet(true)
                .month("month")
                .operationType(PublicDatePropertyOperation.OperationType.DATE)
                .operator("operator")
                .year(0)
                .build()

        val roundtrippedPublicDatePropertyOperation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicDatePropertyOperation),
                jacksonTypeRef<PublicDatePropertyOperation>(),
            )

        assertThat(roundtrippedPublicDatePropertyOperation).isEqualTo(publicDatePropertyOperation)
    }
}
