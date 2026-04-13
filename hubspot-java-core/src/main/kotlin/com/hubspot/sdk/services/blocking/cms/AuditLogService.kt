// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.cms.auditlogs.AuditLogExportParams
import com.hubspot.sdk.models.cms.auditlogs.AuditLogListPage
import com.hubspot.sdk.models.cms.auditlogs.AuditLogListParams
import com.hubspot.sdk.models.cms.auditlogs.CmsAuditLoggingExportSettings
import java.util.function.Consumer

interface AuditLogService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AuditLogService

    fun list(): AuditLogListPage = list(AuditLogListParams.none())

    /** @see list */
    fun list(
        params: AuditLogListParams = AuditLogListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuditLogListPage

    /** @see list */
    fun list(params: AuditLogListParams = AuditLogListParams.none()): AuditLogListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AuditLogListPage =
        list(AuditLogListParams.none(), requestOptions)

    fun export(params: AuditLogExportParams) = export(params, RequestOptions.none())

    /** @see export */
    fun export(params: AuditLogExportParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see export */
    fun export(
        cmsAuditLoggingExportSettings: CmsAuditLoggingExportSettings,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        export(
            AuditLogExportParams.builder()
                .cmsAuditLoggingExportSettings(cmsAuditLoggingExportSettings)
                .build(),
            requestOptions,
        )

    /** @see export */
    fun export(cmsAuditLoggingExportSettings: CmsAuditLoggingExportSettings) =
        export(cmsAuditLoggingExportSettings, RequestOptions.none())

    /** A view of [AuditLogService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AuditLogService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /cms/audit-logs/2026-03`, but is otherwise the same
         * as [AuditLogService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<AuditLogListPage> = list(AuditLogListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AuditLogListParams = AuditLogListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuditLogListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AuditLogListParams = AuditLogListParams.none()
        ): HttpResponseFor<AuditLogListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AuditLogListPage> =
            list(AuditLogListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cms/audit-logs/2026-03/export`, but is otherwise
         * the same as [AuditLogService.export].
         */
        @MustBeClosed
        fun export(params: AuditLogExportParams): HttpResponse =
            export(params, RequestOptions.none())

        /** @see export */
        @MustBeClosed
        fun export(
            params: AuditLogExportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see export */
        @MustBeClosed
        fun export(
            cmsAuditLoggingExportSettings: CmsAuditLoggingExportSettings,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            export(
                AuditLogExportParams.builder()
                    .cmsAuditLoggingExportSettings(cmsAuditLoggingExportSettings)
                    .build(),
                requestOptions,
            )

        /** @see export */
        @MustBeClosed
        fun export(cmsAuditLoggingExportSettings: CmsAuditLoggingExportSettings): HttpResponse =
            export(cmsAuditLoggingExportSettings, RequestOptions.none())
    }
}
