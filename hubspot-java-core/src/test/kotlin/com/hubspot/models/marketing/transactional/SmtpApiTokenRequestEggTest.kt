// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.transactional

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SmtpApiTokenRequestEggTest {

    @Test
    fun create() {
        val smtpApiTokenRequestEgg =
            SmtpApiTokenRequestEgg.builder()
                .campaignName("campaignName")
                .createContact(true)
                .build()

        assertThat(smtpApiTokenRequestEgg.campaignName()).isEqualTo("campaignName")
        assertThat(smtpApiTokenRequestEgg.createContact()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val smtpApiTokenRequestEgg =
            SmtpApiTokenRequestEgg.builder()
                .campaignName("campaignName")
                .createContact(true)
                .build()

        val roundtrippedSmtpApiTokenRequestEgg =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(smtpApiTokenRequestEgg),
                jacksonTypeRef<SmtpApiTokenRequestEgg>(),
            )

        assertThat(roundtrippedSmtpApiTokenRequestEgg).isEqualTo(smtpApiTokenRequestEgg)
    }
}
