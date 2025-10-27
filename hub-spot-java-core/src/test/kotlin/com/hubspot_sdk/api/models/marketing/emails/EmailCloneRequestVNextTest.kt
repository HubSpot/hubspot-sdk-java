// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.emails

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailCloneRequestVNextTest {

    @Test
    fun create() {
        val emailCloneRequestVNext =
            EmailCloneRequestVNext.builder()
                .id("id")
                .cloneName("cloneName")
                .language("language")
                .build()

        assertThat(emailCloneRequestVNext.id()).isEqualTo("id")
        assertThat(emailCloneRequestVNext.cloneName()).contains("cloneName")
        assertThat(emailCloneRequestVNext.language()).contains("language")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailCloneRequestVNext =
            EmailCloneRequestVNext.builder()
                .id("id")
                .cloneName("cloneName")
                .language("language")
                .build()

        val roundtrippedEmailCloneRequestVNext =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailCloneRequestVNext),
                jacksonTypeRef<EmailCloneRequestVNext>(),
            )

        assertThat(roundtrippedEmailCloneRequestVNext).isEqualTo(emailCloneRequestVNext)
    }
}
