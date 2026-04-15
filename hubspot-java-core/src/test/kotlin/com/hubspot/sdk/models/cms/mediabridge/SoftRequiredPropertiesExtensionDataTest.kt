// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SoftRequiredPropertiesExtensionDataTest {

    @Test
    fun create() {
        val softRequiredPropertiesExtensionData =
            SoftRequiredPropertiesExtensionData.builder().isSoftRequiredProperty(true).build()

        assertThat(softRequiredPropertiesExtensionData.isSoftRequiredProperty()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val softRequiredPropertiesExtensionData =
            SoftRequiredPropertiesExtensionData.builder().isSoftRequiredProperty(true).build()

        val roundtrippedSoftRequiredPropertiesExtensionData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(softRequiredPropertiesExtensionData),
                jacksonTypeRef<SoftRequiredPropertiesExtensionData>(),
            )

        assertThat(roundtrippedSoftRequiredPropertiesExtensionData)
            .isEqualTo(softRequiredPropertiesExtensionData)
    }
}
