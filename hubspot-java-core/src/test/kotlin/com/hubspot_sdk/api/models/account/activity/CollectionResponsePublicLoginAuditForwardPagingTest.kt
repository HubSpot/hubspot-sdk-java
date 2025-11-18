// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.account.activity

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.NextPage
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponsePublicLoginAuditForwardPagingTest {

    @Test
    fun create() {
        val collectionResponsePublicLoginAuditForwardPaging =
            CollectionResponsePublicLoginAuditForwardPaging.builder()
                .addResult(
                    PublicLoginAudit.builder()
                        .id("5432653")
                        .loginAt(OffsetDateTime.parse("2022-04-01T19:36:24.303Z"))
                        .loginSucceeded(true)
                        .countryCode("ie")
                        .email("person3@testdomain.com")
                        .ipAddress("45.56.67.89")
                        .location("location")
                        .regionCode("d")
                        .userAgent("Mozilla/5.0 (Linux; Android 11; M2101K6G)")
                        .userId(876)
                        .build()
                )
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponsePublicLoginAuditForwardPaging.results())
            .containsExactly(
                PublicLoginAudit.builder()
                    .id("5432653")
                    .loginAt(OffsetDateTime.parse("2022-04-01T19:36:24.303Z"))
                    .loginSucceeded(true)
                    .countryCode("ie")
                    .email("person3@testdomain.com")
                    .ipAddress("45.56.67.89")
                    .location("location")
                    .regionCode("d")
                    .userAgent("Mozilla/5.0 (Linux; Android 11; M2101K6G)")
                    .userId(876)
                    .build()
            )
        assertThat(collectionResponsePublicLoginAuditForwardPaging.paging())
            .contains(
                ForwardPaging.builder()
                    .next(NextPage.builder().after("after").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponsePublicLoginAuditForwardPaging =
            CollectionResponsePublicLoginAuditForwardPaging.builder()
                .addResult(
                    PublicLoginAudit.builder()
                        .id("5432653")
                        .loginAt(OffsetDateTime.parse("2022-04-01T19:36:24.303Z"))
                        .loginSucceeded(true)
                        .countryCode("ie")
                        .email("person3@testdomain.com")
                        .ipAddress("45.56.67.89")
                        .location("location")
                        .regionCode("d")
                        .userAgent("Mozilla/5.0 (Linux; Android 11; M2101K6G)")
                        .userId(876)
                        .build()
                )
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponsePublicLoginAuditForwardPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponsePublicLoginAuditForwardPaging),
                jacksonTypeRef<CollectionResponsePublicLoginAuditForwardPaging>(),
            )

        assertThat(roundtrippedCollectionResponsePublicLoginAuditForwardPaging)
            .isEqualTo(collectionResponsePublicLoginAuditForwardPaging)
    }
}
