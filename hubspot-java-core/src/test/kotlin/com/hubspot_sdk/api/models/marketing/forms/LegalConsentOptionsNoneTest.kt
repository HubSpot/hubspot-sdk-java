// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.forms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LegalConsentOptionsNoneTest {

    @Test
    fun create() {
        val legalConsentOptionsNone =
            LegalConsentOptionsNone.builder().type(LegalConsentOptionsNone.Type.NONE).build()

        assertThat(legalConsentOptionsNone.type()).isEqualTo(LegalConsentOptionsNone.Type.NONE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val legalConsentOptionsNone =
            LegalConsentOptionsNone.builder().type(LegalConsentOptionsNone.Type.NONE).build()

        val roundtrippedLegalConsentOptionsNone =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(legalConsentOptionsNone),
                jacksonTypeRef<LegalConsentOptionsNone>(),
            )

        assertThat(roundtrippedLegalConsentOptionsNone).isEqualTo(legalConsentOptionsNone)
    }
}
