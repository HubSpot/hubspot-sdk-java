// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.emails

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SmartEmailFieldTest {

    @Test
    fun create() {
        val smartEmailField = SmartEmailField.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val smartEmailField = SmartEmailField.builder().build()

        val roundtrippedSmartEmailField =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(smartEmailField),
                jacksonTypeRef<SmartEmailField>(),
            )

        assertThat(roundtrippedSmartEmailField).isEqualTo(smartEmailField)
    }
}
