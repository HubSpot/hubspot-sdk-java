// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.cms.domains.Domain
import com.hubspot_sdk.api.models.cms.domains.DomainGetParams
import com.hubspot_sdk.api.models.cms.domains.DomainListPageAsync
import com.hubspot_sdk.api.models.cms.domains.DomainListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DomainServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DomainServiceAsync

    fun list(): CompletableFuture<DomainListPageAsync> = list(DomainListParams.none())

    /** @see list */
    fun list(
        params: DomainListParams = DomainListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DomainListPageAsync>

    /** @see list */
    fun list(
        params: DomainListParams = DomainListParams.none()
    ): CompletableFuture<DomainListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<DomainListPageAsync> =
        list(DomainListParams.none(), requestOptions)

    fun get(domainId: String): CompletableFuture<Domain> = get(domainId, DomainGetParams.none())

    /** @see get */
    fun get(
        domainId: String,
        params: DomainGetParams = DomainGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Domain> =
        get(params.toBuilder().domainId(domainId).build(), requestOptions)

    /** @see get */
    fun get(
        domainId: String,
        params: DomainGetParams = DomainGetParams.none(),
    ): CompletableFuture<Domain> = get(domainId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: DomainGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Domain>

    /** @see get */
    fun get(params: DomainGetParams): CompletableFuture<Domain> = get(params, RequestOptions.none())

    /** @see get */
    fun get(domainId: String, requestOptions: RequestOptions): CompletableFuture<Domain> =
        get(domainId, DomainGetParams.none(), requestOptions)

    /**
     * A view of [DomainServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DomainServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /cms/domains/2026-03`, but is otherwise the same as
         * [DomainServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<DomainListPageAsync>> =
            list(DomainListParams.none())

        /** @see list */
        fun list(
            params: DomainListParams = DomainListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DomainListPageAsync>>

        /** @see list */
        fun list(
            params: DomainListParams = DomainListParams.none()
        ): CompletableFuture<HttpResponseFor<DomainListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DomainListPageAsync>> =
            list(DomainListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/domains/2026-03/{domainId}`, but is otherwise
         * the same as [DomainServiceAsync.get].
         */
        fun get(domainId: String): CompletableFuture<HttpResponseFor<Domain>> =
            get(domainId, DomainGetParams.none())

        /** @see get */
        fun get(
            domainId: String,
            params: DomainGetParams = DomainGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Domain>> =
            get(params.toBuilder().domainId(domainId).build(), requestOptions)

        /** @see get */
        fun get(
            domainId: String,
            params: DomainGetParams = DomainGetParams.none(),
        ): CompletableFuture<HttpResponseFor<Domain>> = get(domainId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: DomainGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Domain>>

        /** @see get */
        fun get(params: DomainGetParams): CompletableFuture<HttpResponseFor<Domain>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            domainId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Domain>> =
            get(domainId, DomainGetParams.none(), requestOptions)
    }
}
