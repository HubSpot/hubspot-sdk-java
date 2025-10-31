// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.cms.auditlogs.AuditLogListPageAsync
import com.hubspot_sdk.api.models.cms.auditlogs.AuditLogListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AuditLogServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AuditLogServiceAsync

    /** Returns audit logs based on filters. */
    fun list(): CompletableFuture<AuditLogListPageAsync> = list(AuditLogListParams.none())

    /** @see list */
    fun list(
        params: AuditLogListParams = AuditLogListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AuditLogListPageAsync>

    /** @see list */
    fun list(
        params: AuditLogListParams = AuditLogListParams.none()
    ): CompletableFuture<AuditLogListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AuditLogListPageAsync> =
        list(AuditLogListParams.none(), requestOptions)

    /**
     * A view of [AuditLogServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AuditLogServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /cms/v3/audit-logs/`, but is otherwise the same as
         * [AuditLogServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AuditLogListPageAsync>> =
            list(AuditLogListParams.none())

        /** @see list */
        fun list(
            params: AuditLogListParams = AuditLogListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AuditLogListPageAsync>>

        /** @see list */
        fun list(
            params: AuditLogListParams = AuditLogListParams.none()
        ): CompletableFuture<HttpResponseFor<AuditLogListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AuditLogListPageAsync>> =
            list(AuditLogListParams.none(), requestOptions)
    }
}
