// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RequiredPropertiesExtensionDataTest {

    @Test
    fun create() {
        val requiredPropertiesExtensionData =
            RequiredPropertiesExtensionData.builder().isRequiredProperty(true).build()

        assertThat(requiredPropertiesExtensionData.isRequiredProperty()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val requiredPropertiesExtensionData =
            RequiredPropertiesExtensionData.builder().isRequiredProperty(true).build()

        val roundtrippedRequiredPropertiesExtensionData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(requiredPropertiesExtensionData),
                jacksonTypeRef<RequiredPropertiesExtensionData>(),
            )

        assertThat(roundtrippedRequiredPropertiesExtensionData)
            .isEqualTo(requiredPropertiesExtensionData)
    }
}
