// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.limits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LimitAndUsageForObjectTypeTest {

    @Test
    fun create() {
        val limitAndUsageForObjectType =
            LimitAndUsageForObjectType.builder()
                .limit(0)
                .objectTypeId("objectTypeId")
                .percentage(0.0)
                .pluralLabel("pluralLabel")
                .singularLabel("singularLabel")
                .usage(0)
                .build()

        assertThat(limitAndUsageForObjectType.limit()).isEqualTo(0)
        assertThat(limitAndUsageForObjectType.objectTypeId()).isEqualTo("objectTypeId")
        assertThat(limitAndUsageForObjectType.percentage()).isEqualTo(0.0)
        assertThat(limitAndUsageForObjectType.pluralLabel()).isEqualTo("pluralLabel")
        assertThat(limitAndUsageForObjectType.singularLabel()).isEqualTo("singularLabel")
        assertThat(limitAndUsageForObjectType.usage()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val limitAndUsageForObjectType =
            LimitAndUsageForObjectType.builder()
                .limit(0)
                .objectTypeId("objectTypeId")
                .percentage(0.0)
                .pluralLabel("pluralLabel")
                .singularLabel("singularLabel")
                .usage(0)
                .build()

        val roundtrippedLimitAndUsageForObjectType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(limitAndUsageForObjectType),
                jacksonTypeRef<LimitAndUsageForObjectType>(),
            )

        assertThat(roundtrippedLimitAndUsageForObjectType).isEqualTo(limitAndUsageForObjectType)
    }
}
