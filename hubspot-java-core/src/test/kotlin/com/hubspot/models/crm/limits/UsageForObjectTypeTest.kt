// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.limits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageForObjectTypeTest {

    @Test
    fun create() {
        val usageForObjectType =
            UsageForObjectType.builder()
                .objectTypeId("objectTypeId")
                .pluralLabel("pluralLabel")
                .singularLabel("singularLabel")
                .usage(0)
                .build()

        assertThat(usageForObjectType.objectTypeId()).isEqualTo("objectTypeId")
        assertThat(usageForObjectType.pluralLabel()).isEqualTo("pluralLabel")
        assertThat(usageForObjectType.singularLabel()).isEqualTo("singularLabel")
        assertThat(usageForObjectType.usage()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val usageForObjectType =
            UsageForObjectType.builder()
                .objectTypeId("objectTypeId")
                .pluralLabel("pluralLabel")
                .singularLabel("singularLabel")
                .usage(0)
                .build()

        val roundtrippedUsageForObjectType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(usageForObjectType),
                jacksonTypeRef<UsageForObjectType>(),
            )

        assertThat(roundtrippedUsageForObjectType).isEqualTo(usageForObjectType)
    }
}
