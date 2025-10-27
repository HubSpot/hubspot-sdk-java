// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.emails

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicEmailRecipientsTest {

    @Test
    fun create() {
        val publicEmailRecipients =
            PublicEmailRecipients.builder().addExclude("string").addInclude("string").build()

        assertThat(publicEmailRecipients.exclude().getOrNull()).containsExactly("string")
        assertThat(publicEmailRecipients.include().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicEmailRecipients =
            PublicEmailRecipients.builder().addExclude("string").addInclude("string").build()

        val roundtrippedPublicEmailRecipients =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicEmailRecipients),
                jacksonTypeRef<PublicEmailRecipients>(),
            )

        assertThat(roundtrippedPublicEmailRecipients).isEqualTo(publicEmailRecipients)
    }
}
