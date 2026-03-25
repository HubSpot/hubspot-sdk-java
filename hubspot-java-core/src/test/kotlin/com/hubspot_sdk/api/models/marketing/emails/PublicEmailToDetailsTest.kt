// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.emails

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicEmailToDetailsTest {

    @Test
    fun create() {
        val publicEmailToDetails =
            PublicEmailToDetails.builder()
                .contactIds(
                    PublicEmailRecipients.builder()
                        .addExclude("string")
                        .addInclude("string")
                        .build()
                )
                .contactIlsLists(
                    PublicEmailRecipients.builder()
                        .addExclude("string")
                        .addInclude("string")
                        .build()
                )
                .contactLists(
                    PublicEmailRecipients.builder()
                        .addExclude("string")
                        .addInclude("string")
                        .build()
                )
                .limitSendFrequency(true)
                .suppressGraymail(true)
                .build()

        assertThat(publicEmailToDetails.contactIds())
            .contains(
                PublicEmailRecipients.builder().addExclude("string").addInclude("string").build()
            )
        assertThat(publicEmailToDetails.contactIlsLists())
            .contains(
                PublicEmailRecipients.builder().addExclude("string").addInclude("string").build()
            )
        assertThat(publicEmailToDetails.contactLists())
            .contains(
                PublicEmailRecipients.builder().addExclude("string").addInclude("string").build()
            )
        assertThat(publicEmailToDetails.limitSendFrequency()).contains(true)
        assertThat(publicEmailToDetails.suppressGraymail()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicEmailToDetails =
            PublicEmailToDetails.builder()
                .contactIds(
                    PublicEmailRecipients.builder()
                        .addExclude("string")
                        .addInclude("string")
                        .build()
                )
                .contactIlsLists(
                    PublicEmailRecipients.builder()
                        .addExclude("string")
                        .addInclude("string")
                        .build()
                )
                .contactLists(
                    PublicEmailRecipients.builder()
                        .addExclude("string")
                        .addInclude("string")
                        .build()
                )
                .limitSendFrequency(true)
                .suppressGraymail(true)
                .build()

        val roundtrippedPublicEmailToDetails =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicEmailToDetails),
                jacksonTypeRef<PublicEmailToDetails>(),
            )

        assertThat(roundtrippedPublicEmailToDetails).isEqualTo(publicEmailToDetails)
    }
}
