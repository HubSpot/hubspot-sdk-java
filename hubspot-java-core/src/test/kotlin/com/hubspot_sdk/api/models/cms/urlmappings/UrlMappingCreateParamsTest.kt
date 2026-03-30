// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.urlmappings

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UrlMappingCreateParamsTest {

    @Test
    fun create() {
        UrlMappingCreateParams.builder()
            .urlMappingsUrlMapping(
                UrlMappingsUrlMapping.builder()
                    .id(0L)
                    .cdnPurgeEmbargoTime(0L)
                    .contentGroupId(0L)
                    .cosObjectType(UrlMappingsUrlMapping.CosObjectType.ACCESS_GROUP_MEMBERSHIP)
                    .created(0L)
                    .createdById(0)
                    .deletedAt(0L)
                    .destination("destination")
                    .internallyCreated(true)
                    .isActive(true)
                    .isMatchFullUrl(true)
                    .isMatchQueryString(true)
                    .isOnlyAfterNotFound(true)
                    .isPattern(true)
                    .isProtocolAgnostic(true)
                    .isRegex(true)
                    .isTrailingSlashOptional(true)
                    .label("label")
                    .name("name")
                    .note("note")
                    .portalId(0)
                    .precedence(0)
                    .redirectStyle(0)
                    .routePrefix("routePrefix")
                    .updated(0L)
                    .updatedById(0)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            UrlMappingCreateParams.builder()
                .urlMappingsUrlMapping(
                    UrlMappingsUrlMapping.builder()
                        .id(0L)
                        .cdnPurgeEmbargoTime(0L)
                        .contentGroupId(0L)
                        .cosObjectType(UrlMappingsUrlMapping.CosObjectType.ACCESS_GROUP_MEMBERSHIP)
                        .created(0L)
                        .createdById(0)
                        .deletedAt(0L)
                        .destination("destination")
                        .internallyCreated(true)
                        .isActive(true)
                        .isMatchFullUrl(true)
                        .isMatchQueryString(true)
                        .isOnlyAfterNotFound(true)
                        .isPattern(true)
                        .isProtocolAgnostic(true)
                        .isRegex(true)
                        .isTrailingSlashOptional(true)
                        .label("label")
                        .name("name")
                        .note("note")
                        .portalId(0)
                        .precedence(0)
                        .redirectStyle(0)
                        .routePrefix("routePrefix")
                        .updated(0L)
                        .updatedById(0)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                UrlMappingsUrlMapping.builder()
                    .id(0L)
                    .cdnPurgeEmbargoTime(0L)
                    .contentGroupId(0L)
                    .cosObjectType(UrlMappingsUrlMapping.CosObjectType.ACCESS_GROUP_MEMBERSHIP)
                    .created(0L)
                    .createdById(0)
                    .deletedAt(0L)
                    .destination("destination")
                    .internallyCreated(true)
                    .isActive(true)
                    .isMatchFullUrl(true)
                    .isMatchQueryString(true)
                    .isOnlyAfterNotFound(true)
                    .isPattern(true)
                    .isProtocolAgnostic(true)
                    .isRegex(true)
                    .isTrailingSlashOptional(true)
                    .label("label")
                    .name("name")
                    .note("note")
                    .portalId(0)
                    .precedence(0)
                    .redirectStyle(0)
                    .routePrefix("routePrefix")
                    .updated(0L)
                    .updatedById(0)
                    .build()
            )
    }
}
