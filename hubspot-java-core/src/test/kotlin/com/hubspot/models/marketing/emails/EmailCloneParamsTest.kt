// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.emails

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailCloneParamsTest {

    @Test
    fun create() {
        EmailCloneParams.builder()
            .emailCloneRequestVNext(
                EmailCloneRequestVNext.builder()
                    .id("id")
                    .cloneName("cloneName")
                    .language("language")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            EmailCloneParams.builder()
                .emailCloneRequestVNext(
                    EmailCloneRequestVNext.builder()
                        .id("id")
                        .cloneName("cloneName")
                        .language("language")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                EmailCloneRequestVNext.builder()
                    .id("id")
                    .cloneName("cloneName")
                    .language("language")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EmailCloneParams.builder()
                .emailCloneRequestVNext(EmailCloneRequestVNext.builder().id("id").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(EmailCloneRequestVNext.builder().id("id").build())
    }
}
