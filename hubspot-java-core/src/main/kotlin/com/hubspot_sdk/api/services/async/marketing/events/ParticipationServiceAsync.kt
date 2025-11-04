// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing.events

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.marketing.events.AttendanceCounters
import com.hubspot_sdk.api.models.marketing.events.participations.ParticipationGetByExternalAccountAndEventIdParams
import com.hubspot_sdk.api.models.marketing.events.participations.ParticipationGetByIdParams
import com.hubspot_sdk.api.models.marketing.events.participations.ParticipationListBreakdownByContactPageAsync
import com.hubspot_sdk.api.models.marketing.events.participations.ParticipationListBreakdownByContactParams
import com.hubspot_sdk.api.models.marketing.events.participations.ParticipationListBreakdownByExternalAccountAndEventIdPageAsync
import com.hubspot_sdk.api.models.marketing.events.participations.ParticipationListBreakdownByExternalAccountAndEventIdParams
import com.hubspot_sdk.api.models.marketing.events.participations.ParticipationListBreakdownByIdPageAsync
import com.hubspot_sdk.api.models.marketing.events.participations.ParticipationListBreakdownByIdParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ParticipationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ParticipationServiceAsync

    /**
     * Read Marketing event's participations counters by externalAccountId and externalEventId pair.
     */
    fun getByExternalAccountAndEventId(
        externalEventId: String,
        params: ParticipationGetByExternalAccountAndEventIdParams,
    ): CompletableFuture<AttendanceCounters> =
        getByExternalAccountAndEventId(externalEventId, params, RequestOptions.none())

    /** @see getByExternalAccountAndEventId */
    fun getByExternalAccountAndEventId(
        externalEventId: String,
        params: ParticipationGetByExternalAccountAndEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AttendanceCounters> =
        getByExternalAccountAndEventId(
            params.toBuilder().externalEventId(externalEventId).build(),
            requestOptions,
        )

    /** @see getByExternalAccountAndEventId */
    fun getByExternalAccountAndEventId(
        params: ParticipationGetByExternalAccountAndEventIdParams
    ): CompletableFuture<AttendanceCounters> =
        getByExternalAccountAndEventId(params, RequestOptions.none())

    /** @see getByExternalAccountAndEventId */
    fun getByExternalAccountAndEventId(
        params: ParticipationGetByExternalAccountAndEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AttendanceCounters>

    /** Read Marketing event's participations counters by internal identifier marketingEventId. */
    fun getById(marketingEventId: Long): CompletableFuture<AttendanceCounters> =
        getById(marketingEventId, ParticipationGetByIdParams.none())

    /** @see getById */
    fun getById(
        marketingEventId: Long,
        params: ParticipationGetByIdParams = ParticipationGetByIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AttendanceCounters> =
        getById(params.toBuilder().marketingEventId(marketingEventId).build(), requestOptions)

    /** @see getById */
    fun getById(
        marketingEventId: Long,
        params: ParticipationGetByIdParams = ParticipationGetByIdParams.none(),
    ): CompletableFuture<AttendanceCounters> =
        getById(marketingEventId, params, RequestOptions.none())

    /** @see getById */
    fun getById(
        params: ParticipationGetByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AttendanceCounters>

    /** @see getById */
    fun getById(params: ParticipationGetByIdParams): CompletableFuture<AttendanceCounters> =
        getById(params, RequestOptions.none())

    /** @see getById */
    fun getById(
        marketingEventId: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<AttendanceCounters> =
        getById(marketingEventId, ParticipationGetByIdParams.none(), requestOptions)

    /** Read Contact's participations by identifier - email or internal id. */
    fun listBreakdownByContact(
        contactIdentifier: String
    ): CompletableFuture<ParticipationListBreakdownByContactPageAsync> =
        listBreakdownByContact(contactIdentifier, ParticipationListBreakdownByContactParams.none())

    /** @see listBreakdownByContact */
    fun listBreakdownByContact(
        contactIdentifier: String,
        params: ParticipationListBreakdownByContactParams =
            ParticipationListBreakdownByContactParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParticipationListBreakdownByContactPageAsync> =
        listBreakdownByContact(
            params.toBuilder().contactIdentifier(contactIdentifier).build(),
            requestOptions,
        )

    /** @see listBreakdownByContact */
    fun listBreakdownByContact(
        contactIdentifier: String,
        params: ParticipationListBreakdownByContactParams =
            ParticipationListBreakdownByContactParams.none(),
    ): CompletableFuture<ParticipationListBreakdownByContactPageAsync> =
        listBreakdownByContact(contactIdentifier, params, RequestOptions.none())

    /** @see listBreakdownByContact */
    fun listBreakdownByContact(
        params: ParticipationListBreakdownByContactParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParticipationListBreakdownByContactPageAsync>

    /** @see listBreakdownByContact */
    fun listBreakdownByContact(
        params: ParticipationListBreakdownByContactParams
    ): CompletableFuture<ParticipationListBreakdownByContactPageAsync> =
        listBreakdownByContact(params, RequestOptions.none())

    /** @see listBreakdownByContact */
    fun listBreakdownByContact(
        contactIdentifier: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ParticipationListBreakdownByContactPageAsync> =
        listBreakdownByContact(
            contactIdentifier,
            ParticipationListBreakdownByContactParams.none(),
            requestOptions,
        )

    /**
     * Read Marketing event's participations breakdown with optional filters by externalAccountId
     * and externalEventId pair.
     */
    fun listBreakdownByExternalAccountAndEventId(
        externalEventId: String,
        params: ParticipationListBreakdownByExternalAccountAndEventIdParams,
    ): CompletableFuture<ParticipationListBreakdownByExternalAccountAndEventIdPageAsync> =
        listBreakdownByExternalAccountAndEventId(externalEventId, params, RequestOptions.none())

    /** @see listBreakdownByExternalAccountAndEventId */
    fun listBreakdownByExternalAccountAndEventId(
        externalEventId: String,
        params: ParticipationListBreakdownByExternalAccountAndEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParticipationListBreakdownByExternalAccountAndEventIdPageAsync> =
        listBreakdownByExternalAccountAndEventId(
            params.toBuilder().externalEventId(externalEventId).build(),
            requestOptions,
        )

    /** @see listBreakdownByExternalAccountAndEventId */
    fun listBreakdownByExternalAccountAndEventId(
        params: ParticipationListBreakdownByExternalAccountAndEventIdParams
    ): CompletableFuture<ParticipationListBreakdownByExternalAccountAndEventIdPageAsync> =
        listBreakdownByExternalAccountAndEventId(params, RequestOptions.none())

    /** @see listBreakdownByExternalAccountAndEventId */
    fun listBreakdownByExternalAccountAndEventId(
        params: ParticipationListBreakdownByExternalAccountAndEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParticipationListBreakdownByExternalAccountAndEventIdPageAsync>

    /**
     * Read Marketing event's participations breakdown with optional filters by internal identifier
     * marketingEventId.
     */
    fun listBreakdownById(
        marketingEventId: Long
    ): CompletableFuture<ParticipationListBreakdownByIdPageAsync> =
        listBreakdownById(marketingEventId, ParticipationListBreakdownByIdParams.none())

    /** @see listBreakdownById */
    fun listBreakdownById(
        marketingEventId: Long,
        params: ParticipationListBreakdownByIdParams = ParticipationListBreakdownByIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParticipationListBreakdownByIdPageAsync> =
        listBreakdownById(
            params.toBuilder().marketingEventId(marketingEventId).build(),
            requestOptions,
        )

    /** @see listBreakdownById */
    fun listBreakdownById(
        marketingEventId: Long,
        params: ParticipationListBreakdownByIdParams = ParticipationListBreakdownByIdParams.none(),
    ): CompletableFuture<ParticipationListBreakdownByIdPageAsync> =
        listBreakdownById(marketingEventId, params, RequestOptions.none())

    /** @see listBreakdownById */
    fun listBreakdownById(
        params: ParticipationListBreakdownByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ParticipationListBreakdownByIdPageAsync>

    /** @see listBreakdownById */
    fun listBreakdownById(
        params: ParticipationListBreakdownByIdParams
    ): CompletableFuture<ParticipationListBreakdownByIdPageAsync> =
        listBreakdownById(params, RequestOptions.none())

    /** @see listBreakdownById */
    fun listBreakdownById(
        marketingEventId: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<ParticipationListBreakdownByIdPageAsync> =
        listBreakdownById(
            marketingEventId,
            ParticipationListBreakdownByIdParams.none(),
            requestOptions,
        )

    /**
     * A view of [ParticipationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ParticipationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /marketing/v3/marketing-events/participations/{externalAccountId}/{externalEventId}`, but
         * is otherwise the same as [ParticipationServiceAsync.getByExternalAccountAndEventId].
         */
        fun getByExternalAccountAndEventId(
            externalEventId: String,
            params: ParticipationGetByExternalAccountAndEventIdParams,
        ): CompletableFuture<HttpResponseFor<AttendanceCounters>> =
            getByExternalAccountAndEventId(externalEventId, params, RequestOptions.none())

        /** @see getByExternalAccountAndEventId */
        fun getByExternalAccountAndEventId(
            externalEventId: String,
            params: ParticipationGetByExternalAccountAndEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AttendanceCounters>> =
            getByExternalAccountAndEventId(
                params.toBuilder().externalEventId(externalEventId).build(),
                requestOptions,
            )

        /** @see getByExternalAccountAndEventId */
        fun getByExternalAccountAndEventId(
            params: ParticipationGetByExternalAccountAndEventIdParams
        ): CompletableFuture<HttpResponseFor<AttendanceCounters>> =
            getByExternalAccountAndEventId(params, RequestOptions.none())

        /** @see getByExternalAccountAndEventId */
        fun getByExternalAccountAndEventId(
            params: ParticipationGetByExternalAccountAndEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AttendanceCounters>>

        /**
         * Returns a raw HTTP response for `get
         * /marketing/v3/marketing-events/participations/{marketingEventId}`, but is otherwise the
         * same as [ParticipationServiceAsync.getById].
         */
        fun getById(
            marketingEventId: Long
        ): CompletableFuture<HttpResponseFor<AttendanceCounters>> =
            getById(marketingEventId, ParticipationGetByIdParams.none())

        /** @see getById */
        fun getById(
            marketingEventId: Long,
            params: ParticipationGetByIdParams = ParticipationGetByIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AttendanceCounters>> =
            getById(params.toBuilder().marketingEventId(marketingEventId).build(), requestOptions)

        /** @see getById */
        fun getById(
            marketingEventId: Long,
            params: ParticipationGetByIdParams = ParticipationGetByIdParams.none(),
        ): CompletableFuture<HttpResponseFor<AttendanceCounters>> =
            getById(marketingEventId, params, RequestOptions.none())

        /** @see getById */
        fun getById(
            params: ParticipationGetByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AttendanceCounters>>

        /** @see getById */
        fun getById(
            params: ParticipationGetByIdParams
        ): CompletableFuture<HttpResponseFor<AttendanceCounters>> =
            getById(params, RequestOptions.none())

        /** @see getById */
        fun getById(
            marketingEventId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AttendanceCounters>> =
            getById(marketingEventId, ParticipationGetByIdParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /marketing/v3/marketing-events/participations/contacts/{contactIdentifier}/breakdown`,
         * but is otherwise the same as [ParticipationServiceAsync.listBreakdownByContact].
         */
        fun listBreakdownByContact(
            contactIdentifier: String
        ): CompletableFuture<HttpResponseFor<ParticipationListBreakdownByContactPageAsync>> =
            listBreakdownByContact(
                contactIdentifier,
                ParticipationListBreakdownByContactParams.none(),
            )

        /** @see listBreakdownByContact */
        fun listBreakdownByContact(
            contactIdentifier: String,
            params: ParticipationListBreakdownByContactParams =
                ParticipationListBreakdownByContactParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ParticipationListBreakdownByContactPageAsync>> =
            listBreakdownByContact(
                params.toBuilder().contactIdentifier(contactIdentifier).build(),
                requestOptions,
            )

        /** @see listBreakdownByContact */
        fun listBreakdownByContact(
            contactIdentifier: String,
            params: ParticipationListBreakdownByContactParams =
                ParticipationListBreakdownByContactParams.none(),
        ): CompletableFuture<HttpResponseFor<ParticipationListBreakdownByContactPageAsync>> =
            listBreakdownByContact(contactIdentifier, params, RequestOptions.none())

        /** @see listBreakdownByContact */
        fun listBreakdownByContact(
            params: ParticipationListBreakdownByContactParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ParticipationListBreakdownByContactPageAsync>>

        /** @see listBreakdownByContact */
        fun listBreakdownByContact(
            params: ParticipationListBreakdownByContactParams
        ): CompletableFuture<HttpResponseFor<ParticipationListBreakdownByContactPageAsync>> =
            listBreakdownByContact(params, RequestOptions.none())

        /** @see listBreakdownByContact */
        fun listBreakdownByContact(
            contactIdentifier: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ParticipationListBreakdownByContactPageAsync>> =
            listBreakdownByContact(
                contactIdentifier,
                ParticipationListBreakdownByContactParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /marketing/v3/marketing-events/participations/{externalAccountId}/{externalEventId}/breakdown`,
         * but is otherwise the same as
         * [ParticipationServiceAsync.listBreakdownByExternalAccountAndEventId].
         */
        fun listBreakdownByExternalAccountAndEventId(
            externalEventId: String,
            params: ParticipationListBreakdownByExternalAccountAndEventIdParams,
        ): CompletableFuture<
            HttpResponseFor<ParticipationListBreakdownByExternalAccountAndEventIdPageAsync>
        > = listBreakdownByExternalAccountAndEventId(externalEventId, params, RequestOptions.none())

        /** @see listBreakdownByExternalAccountAndEventId */
        fun listBreakdownByExternalAccountAndEventId(
            externalEventId: String,
            params: ParticipationListBreakdownByExternalAccountAndEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<ParticipationListBreakdownByExternalAccountAndEventIdPageAsync>
        > =
            listBreakdownByExternalAccountAndEventId(
                params.toBuilder().externalEventId(externalEventId).build(),
                requestOptions,
            )

        /** @see listBreakdownByExternalAccountAndEventId */
        fun listBreakdownByExternalAccountAndEventId(
            params: ParticipationListBreakdownByExternalAccountAndEventIdParams
        ): CompletableFuture<
            HttpResponseFor<ParticipationListBreakdownByExternalAccountAndEventIdPageAsync>
        > = listBreakdownByExternalAccountAndEventId(params, RequestOptions.none())

        /** @see listBreakdownByExternalAccountAndEventId */
        fun listBreakdownByExternalAccountAndEventId(
            params: ParticipationListBreakdownByExternalAccountAndEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<ParticipationListBreakdownByExternalAccountAndEventIdPageAsync>
        >

        /**
         * Returns a raw HTTP response for `get
         * /marketing/v3/marketing-events/participations/{marketingEventId}/breakdown`, but is
         * otherwise the same as [ParticipationServiceAsync.listBreakdownById].
         */
        fun listBreakdownById(
            marketingEventId: Long
        ): CompletableFuture<HttpResponseFor<ParticipationListBreakdownByIdPageAsync>> =
            listBreakdownById(marketingEventId, ParticipationListBreakdownByIdParams.none())

        /** @see listBreakdownById */
        fun listBreakdownById(
            marketingEventId: Long,
            params: ParticipationListBreakdownByIdParams =
                ParticipationListBreakdownByIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ParticipationListBreakdownByIdPageAsync>> =
            listBreakdownById(
                params.toBuilder().marketingEventId(marketingEventId).build(),
                requestOptions,
            )

        /** @see listBreakdownById */
        fun listBreakdownById(
            marketingEventId: Long,
            params: ParticipationListBreakdownByIdParams =
                ParticipationListBreakdownByIdParams.none(),
        ): CompletableFuture<HttpResponseFor<ParticipationListBreakdownByIdPageAsync>> =
            listBreakdownById(marketingEventId, params, RequestOptions.none())

        /** @see listBreakdownById */
        fun listBreakdownById(
            params: ParticipationListBreakdownByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ParticipationListBreakdownByIdPageAsync>>

        /** @see listBreakdownById */
        fun listBreakdownById(
            params: ParticipationListBreakdownByIdParams
        ): CompletableFuture<HttpResponseFor<ParticipationListBreakdownByIdPageAsync>> =
            listBreakdownById(params, RequestOptions.none())

        /** @see listBreakdownById */
        fun listBreakdownById(
            marketingEventId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ParticipationListBreakdownByIdPageAsync>> =
            listBreakdownById(
                marketingEventId,
                ParticipationListBreakdownByIdParams.none(),
                requestOptions,
            )
    }
}
