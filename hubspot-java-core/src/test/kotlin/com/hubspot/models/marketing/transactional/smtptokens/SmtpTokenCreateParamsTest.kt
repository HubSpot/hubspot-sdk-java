// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.transactional.smtptokens

import com.hubspot.models.marketing.transactional.SmtpApiTokenRequestEgg
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SmtpTokenCreateParamsTest {

    @Test
    fun create() {
        SmtpTokenCreateParams.builder()
            .smtpApiTokenRequestEgg(
                SmtpApiTokenRequestEgg.builder()
                    .campaignName("campaignName")
                    .createContact(true)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            SmtpTokenCreateParams.builder()
                .smtpApiTokenRequestEgg(
                    SmtpApiTokenRequestEgg.builder()
                        .campaignName("campaignName")
                        .createContact(true)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                SmtpApiTokenRequestEgg.builder()
                    .campaignName("campaignName")
                    .createContact(true)
                    .build()
            )
    }
}
