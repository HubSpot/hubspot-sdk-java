// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.cms.domains.Domain
import com.hubspot_sdk.api.models.cms.domains.DomainListPage
import com.hubspot_sdk.api.models.cms.domains.DomainListParams
import com.hubspot_sdk.api.models.cms.domains.DomainReadParams
import java.util.function.Consumer

interface DomainService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DomainService

    /**
     * Returns all existing domains that have been created. Results can be limited and filtered by
     * creation or updated date.
     */
    fun list(): DomainListPage = list(DomainListParams.none())

    /** @see list */
    fun list(
        params: DomainListParams = DomainListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DomainListPage

    /** @see list */
    fun list(params: DomainListParams = DomainListParams.none()): DomainListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): DomainListPage =
        list(DomainListParams.none(), requestOptions)

    /** Returns a single domains with the id specified. */
    fun read(domainId: String): Domain = read(domainId, DomainReadParams.none())

    /** @see read */
    fun read(
        domainId: String,
        params: DomainReadParams = DomainReadParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Domain = read(params.toBuilder().domainId(domainId).build(), requestOptions)

    /** @see read */
    fun read(domainId: String, params: DomainReadParams = DomainReadParams.none()): Domain =
        read(domainId, params, RequestOptions.none())

    /** @see read */
    fun read(
        params: DomainReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Domain

    /** @see read */
    fun read(params: DomainReadParams): Domain = read(params, RequestOptions.none())

    /** @see read */
    fun read(domainId: String, requestOptions: RequestOptions): Domain =
        read(domainId, DomainReadParams.none(), requestOptions)

    /** A view of [DomainService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DomainService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /cms/v3/domains/`, but is otherwise the same as
         * [DomainService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<DomainListPage> = list(DomainListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DomainListParams = DomainListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DomainListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: DomainListParams = DomainListParams.none()
        ): HttpResponseFor<DomainListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DomainListPage> =
            list(DomainListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/v3/domains/{domainId}`, but is otherwise the
         * same as [DomainService.read].
         */
        @MustBeClosed
        fun read(domainId: String): HttpResponseFor<Domain> =
            read(domainId, DomainReadParams.none())

        /** @see read */
        @MustBeClosed
        fun read(
            domainId: String,
            params: DomainReadParams = DomainReadParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Domain> =
            read(params.toBuilder().domainId(domainId).build(), requestOptions)

        /** @see read */
        @MustBeClosed
        fun read(
            domainId: String,
            params: DomainReadParams = DomainReadParams.none(),
        ): HttpResponseFor<Domain> = read(domainId, params, RequestOptions.none())

        /** @see read */
        @MustBeClosed
        fun read(
            params: DomainReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Domain>

        /** @see read */
        @MustBeClosed
        fun read(params: DomainReadParams): HttpResponseFor<Domain> =
            read(params, RequestOptions.none())

        /** @see read */
        @MustBeClosed
        fun read(domainId: String, requestOptions: RequestOptions): HttpResponseFor<Domain> =
            read(domainId, DomainReadParams.none(), requestOptions)
    }
}
