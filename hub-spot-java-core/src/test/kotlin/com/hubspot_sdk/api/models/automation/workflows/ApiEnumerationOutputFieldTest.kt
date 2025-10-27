// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiEnumerationOutputFieldTest {

    @Test
    fun create() {
        val apiEnumerationOutputField =
            ApiEnumerationOutputField.builder()
                .name("name")
                .addOption("string")
                .type(ApiEnumerationOutputField.Type.ENUMERATION)
                .build()

        assertThat(apiEnumerationOutputField.name()).isEqualTo("name")
        assertThat(apiEnumerationOutputField.options()).containsExactly("string")
        assertThat(apiEnumerationOutputField.type())
            .isEqualTo(ApiEnumerationOutputField.Type.ENUMERATION)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiEnumerationOutputField =
            ApiEnumerationOutputField.builder()
                .name("name")
                .addOption("string")
                .type(ApiEnumerationOutputField.Type.ENUMERATION)
                .build()

        val roundtrippedApiEnumerationOutputField =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiEnumerationOutputField),
                jacksonTypeRef<ApiEnumerationOutputField>(),
            )

        assertThat(roundtrippedApiEnumerationOutputField).isEqualTo(apiEnumerationOutputField)
    }
}
