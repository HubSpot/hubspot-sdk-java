// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.emails

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.NextPage
import com.hubspot_sdk.api.models.PreviousPage
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailsPagingTest {

    @Test
    fun create() {
        val emailsPaging =
            EmailsPaging.builder()
                .next(NextPage.builder().after("").link("").build())
                .prev(PreviousPage.builder().before("before").link("link").build())
                .build()

        assertThat(emailsPaging.next()).isEqualTo(NextPage.builder().after("").link("").build())
        assertThat(emailsPaging.prev())
            .contains(PreviousPage.builder().before("before").link("link").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailsPaging =
            EmailsPaging.builder()
                .next(NextPage.builder().after("").link("").build())
                .prev(PreviousPage.builder().before("before").link("link").build())
                .build()

        val roundtrippedEmailsPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailsPaging),
                jacksonTypeRef<EmailsPaging>(),
            )

        assertThat(roundtrippedEmailsPaging).isEqualTo(emailsPaging)
    }
}
