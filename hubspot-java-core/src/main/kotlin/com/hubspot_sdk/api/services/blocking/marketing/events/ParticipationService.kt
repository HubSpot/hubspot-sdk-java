// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing.events

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.marketing.events.AttendanceCounters
import com.hubspot_sdk.api.models.marketing.events.participations.ParticipationGetByExternalAccountAndEventIdParams
import com.hubspot_sdk.api.models.marketing.events.participations.ParticipationGetByIdParams
import com.hubspot_sdk.api.models.marketing.events.participations.ParticipationListBreakdownByContactPage
import com.hubspot_sdk.api.models.marketing.events.participations.ParticipationListBreakdownByContactParams
import com.hubspot_sdk.api.models.marketing.events.participations.ParticipationListBreakdownByExternalAccountAndEventIdPage
import com.hubspot_sdk.api.models.marketing.events.participations.ParticipationListBreakdownByExternalAccountAndEventIdParams
import com.hubspot_sdk.api.models.marketing.events.participations.ParticipationListBreakdownByIdPage
import com.hubspot_sdk.api.models.marketing.events.participations.ParticipationListBreakdownByIdParams
import java.util.function.Consumer

interface ParticipationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ParticipationService

    /**
     * Read Marketing event's participations counters by externalAccountId and externalEventId pair.
     */
    fun getByExternalAccountAndEventId(
        externalEventId: String,
        params: ParticipationGetByExternalAccountAndEventIdParams,
    ): AttendanceCounters =
        getByExternalAccountAndEventId(externalEventId, params, RequestOptions.none())

    /** @see getByExternalAccountAndEventId */
    fun getByExternalAccountAndEventId(
        externalEventId: String,
        params: ParticipationGetByExternalAccountAndEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttendanceCounters =
        getByExternalAccountAndEventId(
            params.toBuilder().externalEventId(externalEventId).build(),
            requestOptions,
        )

    /** @see getByExternalAccountAndEventId */
    fun getByExternalAccountAndEventId(
        params: ParticipationGetByExternalAccountAndEventIdParams
    ): AttendanceCounters = getByExternalAccountAndEventId(params, RequestOptions.none())

    /** @see getByExternalAccountAndEventId */
    fun getByExternalAccountAndEventId(
        params: ParticipationGetByExternalAccountAndEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttendanceCounters

    /** Read Marketing event's participations counters by internal identifier marketingEventId. */
    fun getById(marketingEventId: Long): AttendanceCounters =
        getById(marketingEventId, ParticipationGetByIdParams.none())

    /** @see getById */
    fun getById(
        marketingEventId: Long,
        params: ParticipationGetByIdParams = ParticipationGetByIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttendanceCounters =
        getById(params.toBuilder().marketingEventId(marketingEventId).build(), requestOptions)

    /** @see getById */
    fun getById(
        marketingEventId: Long,
        params: ParticipationGetByIdParams = ParticipationGetByIdParams.none(),
    ): AttendanceCounters = getById(marketingEventId, params, RequestOptions.none())

    /** @see getById */
    fun getById(
        params: ParticipationGetByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttendanceCounters

    /** @see getById */
    fun getById(params: ParticipationGetByIdParams): AttendanceCounters =
        getById(params, RequestOptions.none())

    /** @see getById */
    fun getById(marketingEventId: Long, requestOptions: RequestOptions): AttendanceCounters =
        getById(marketingEventId, ParticipationGetByIdParams.none(), requestOptions)

    /** Read Contact's participations by identifier - email or internal id. */
    fun listBreakdownByContact(contactIdentifier: String): ParticipationListBreakdownByContactPage =
        listBreakdownByContact(contactIdentifier, ParticipationListBreakdownByContactParams.none())

    /** @see listBreakdownByContact */
    fun listBreakdownByContact(
        contactIdentifier: String,
        params: ParticipationListBreakdownByContactParams =
            ParticipationListBreakdownByContactParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ParticipationListBreakdownByContactPage =
        listBreakdownByContact(
            params.toBuilder().contactIdentifier(contactIdentifier).build(),
            requestOptions,
        )

    /** @see listBreakdownByContact */
    fun listBreakdownByContact(
        contactIdentifier: String,
        params: ParticipationListBreakdownByContactParams =
            ParticipationListBreakdownByContactParams.none(),
    ): ParticipationListBreakdownByContactPage =
        listBreakdownByContact(contactIdentifier, params, RequestOptions.none())

    /** @see listBreakdownByContact */
    fun listBreakdownByContact(
        params: ParticipationListBreakdownByContactParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ParticipationListBreakdownByContactPage

    /** @see listBreakdownByContact */
    fun listBreakdownByContact(
        params: ParticipationListBreakdownByContactParams
    ): ParticipationListBreakdownByContactPage =
        listBreakdownByContact(params, RequestOptions.none())

    /** @see listBreakdownByContact */
    fun listBreakdownByContact(
        contactIdentifier: String,
        requestOptions: RequestOptions,
    ): ParticipationListBreakdownByContactPage =
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
    ): ParticipationListBreakdownByExternalAccountAndEventIdPage =
        listBreakdownByExternalAccountAndEventId(externalEventId, params, RequestOptions.none())

    /** @see listBreakdownByExternalAccountAndEventId */
    fun listBreakdownByExternalAccountAndEventId(
        externalEventId: String,
        params: ParticipationListBreakdownByExternalAccountAndEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ParticipationListBreakdownByExternalAccountAndEventIdPage =
        listBreakdownByExternalAccountAndEventId(
            params.toBuilder().externalEventId(externalEventId).build(),
            requestOptions,
        )

    /** @see listBreakdownByExternalAccountAndEventId */
    fun listBreakdownByExternalAccountAndEventId(
        params: ParticipationListBreakdownByExternalAccountAndEventIdParams
    ): ParticipationListBreakdownByExternalAccountAndEventIdPage =
        listBreakdownByExternalAccountAndEventId(params, RequestOptions.none())

    /** @see listBreakdownByExternalAccountAndEventId */
    fun listBreakdownByExternalAccountAndEventId(
        params: ParticipationListBreakdownByExternalAccountAndEventIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ParticipationListBreakdownByExternalAccountAndEventIdPage

    /**
     * Read Marketing event's participations breakdown with optional filters by internal identifier
     * marketingEventId.
     */
    fun listBreakdownById(marketingEventId: Long): ParticipationListBreakdownByIdPage =
        listBreakdownById(marketingEventId, ParticipationListBreakdownByIdParams.none())

    /** @see listBreakdownById */
    fun listBreakdownById(
        marketingEventId: Long,
        params: ParticipationListBreakdownByIdParams = ParticipationListBreakdownByIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ParticipationListBreakdownByIdPage =
        listBreakdownById(
            params.toBuilder().marketingEventId(marketingEventId).build(),
            requestOptions,
        )

    /** @see listBreakdownById */
    fun listBreakdownById(
        marketingEventId: Long,
        params: ParticipationListBreakdownByIdParams = ParticipationListBreakdownByIdParams.none(),
    ): ParticipationListBreakdownByIdPage =
        listBreakdownById(marketingEventId, params, RequestOptions.none())

    /** @see listBreakdownById */
    fun listBreakdownById(
        params: ParticipationListBreakdownByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ParticipationListBreakdownByIdPage

    /** @see listBreakdownById */
    fun listBreakdownById(
        params: ParticipationListBreakdownByIdParams
    ): ParticipationListBreakdownByIdPage = listBreakdownById(params, RequestOptions.none())

    /** @see listBreakdownById */
    fun listBreakdownById(
        marketingEventId: Long,
        requestOptions: RequestOptions,
    ): ParticipationListBreakdownByIdPage =
        listBreakdownById(
            marketingEventId,
            ParticipationListBreakdownByIdParams.none(),
            requestOptions,
        )

    /**
     * A view of [ParticipationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ParticipationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /marketing/marketing-events/2026-03/participations/{externalAccountId}/{externalEventId}`,
         * but is otherwise the same as [ParticipationService.getByExternalAccountAndEventId].
         */
        @MustBeClosed
        fun getByExternalAccountAndEventId(
            externalEventId: String,
            params: ParticipationGetByExternalAccountAndEventIdParams,
        ): HttpResponseFor<AttendanceCounters> =
            getByExternalAccountAndEventId(externalEventId, params, RequestOptions.none())

        /** @see getByExternalAccountAndEventId */
        @MustBeClosed
        fun getByExternalAccountAndEventId(
            externalEventId: String,
            params: ParticipationGetByExternalAccountAndEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttendanceCounters> =
            getByExternalAccountAndEventId(
                params.toBuilder().externalEventId(externalEventId).build(),
                requestOptions,
            )

        /** @see getByExternalAccountAndEventId */
        @MustBeClosed
        fun getByExternalAccountAndEventId(
            params: ParticipationGetByExternalAccountAndEventIdParams
        ): HttpResponseFor<AttendanceCounters> =
            getByExternalAccountAndEventId(params, RequestOptions.none())

        /** @see getByExternalAccountAndEventId */
        @MustBeClosed
        fun getByExternalAccountAndEventId(
            params: ParticipationGetByExternalAccountAndEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttendanceCounters>

        /**
         * Returns a raw HTTP response for `get
         * /marketing/marketing-events/2026-03/participations/{marketingEventId}`, but is otherwise
         * the same as [ParticipationService.getById].
         */
        @MustBeClosed
        fun getById(marketingEventId: Long): HttpResponseFor<AttendanceCounters> =
            getById(marketingEventId, ParticipationGetByIdParams.none())

        /** @see getById */
        @MustBeClosed
        fun getById(
            marketingEventId: Long,
            params: ParticipationGetByIdParams = ParticipationGetByIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttendanceCounters> =
            getById(params.toBuilder().marketingEventId(marketingEventId).build(), requestOptions)

        /** @see getById */
        @MustBeClosed
        fun getById(
            marketingEventId: Long,
            params: ParticipationGetByIdParams = ParticipationGetByIdParams.none(),
        ): HttpResponseFor<AttendanceCounters> =
            getById(marketingEventId, params, RequestOptions.none())

        /** @see getById */
        @MustBeClosed
        fun getById(
            params: ParticipationGetByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttendanceCounters>

        /** @see getById */
        @MustBeClosed
        fun getById(params: ParticipationGetByIdParams): HttpResponseFor<AttendanceCounters> =
            getById(params, RequestOptions.none())

        /** @see getById */
        @MustBeClosed
        fun getById(
            marketingEventId: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AttendanceCounters> =
            getById(marketingEventId, ParticipationGetByIdParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /marketing/marketing-events/2026-03/participations/contacts/{contactIdentifier}/breakdown`,
         * but is otherwise the same as [ParticipationService.listBreakdownByContact].
         */
        @MustBeClosed
        fun listBreakdownByContact(
            contactIdentifier: String
        ): HttpResponseFor<ParticipationListBreakdownByContactPage> =
            listBreakdownByContact(
                contactIdentifier,
                ParticipationListBreakdownByContactParams.none(),
            )

        /** @see listBreakdownByContact */
        @MustBeClosed
        fun listBreakdownByContact(
            contactIdentifier: String,
            params: ParticipationListBreakdownByContactParams =
                ParticipationListBreakdownByContactParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ParticipationListBreakdownByContactPage> =
            listBreakdownByContact(
                params.toBuilder().contactIdentifier(contactIdentifier).build(),
                requestOptions,
            )

        /** @see listBreakdownByContact */
        @MustBeClosed
        fun listBreakdownByContact(
            contactIdentifier: String,
            params: ParticipationListBreakdownByContactParams =
                ParticipationListBreakdownByContactParams.none(),
        ): HttpResponseFor<ParticipationListBreakdownByContactPage> =
            listBreakdownByContact(contactIdentifier, params, RequestOptions.none())

        /** @see listBreakdownByContact */
        @MustBeClosed
        fun listBreakdownByContact(
            params: ParticipationListBreakdownByContactParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ParticipationListBreakdownByContactPage>

        /** @see listBreakdownByContact */
        @MustBeClosed
        fun listBreakdownByContact(
            params: ParticipationListBreakdownByContactParams
        ): HttpResponseFor<ParticipationListBreakdownByContactPage> =
            listBreakdownByContact(params, RequestOptions.none())

        /** @see listBreakdownByContact */
        @MustBeClosed
        fun listBreakdownByContact(
            contactIdentifier: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ParticipationListBreakdownByContactPage> =
            listBreakdownByContact(
                contactIdentifier,
                ParticipationListBreakdownByContactParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /marketing/marketing-events/2026-03/participations/{externalAccountId}/{externalEventId}/breakdown`,
         * but is otherwise the same as
         * [ParticipationService.listBreakdownByExternalAccountAndEventId].
         */
        @MustBeClosed
        fun listBreakdownByExternalAccountAndEventId(
            externalEventId: String,
            params: ParticipationListBreakdownByExternalAccountAndEventIdParams,
        ): HttpResponseFor<ParticipationListBreakdownByExternalAccountAndEventIdPage> =
            listBreakdownByExternalAccountAndEventId(externalEventId, params, RequestOptions.none())

        /** @see listBreakdownByExternalAccountAndEventId */
        @MustBeClosed
        fun listBreakdownByExternalAccountAndEventId(
            externalEventId: String,
            params: ParticipationListBreakdownByExternalAccountAndEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ParticipationListBreakdownByExternalAccountAndEventIdPage> =
            listBreakdownByExternalAccountAndEventId(
                params.toBuilder().externalEventId(externalEventId).build(),
                requestOptions,
            )

        /** @see listBreakdownByExternalAccountAndEventId */
        @MustBeClosed
        fun listBreakdownByExternalAccountAndEventId(
            params: ParticipationListBreakdownByExternalAccountAndEventIdParams
        ): HttpResponseFor<ParticipationListBreakdownByExternalAccountAndEventIdPage> =
            listBreakdownByExternalAccountAndEventId(params, RequestOptions.none())

        /** @see listBreakdownByExternalAccountAndEventId */
        @MustBeClosed
        fun listBreakdownByExternalAccountAndEventId(
            params: ParticipationListBreakdownByExternalAccountAndEventIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ParticipationListBreakdownByExternalAccountAndEventIdPage>

        /**
         * Returns a raw HTTP response for `get
         * /marketing/marketing-events/2026-03/participations/{marketingEventId}/breakdown`, but is
         * otherwise the same as [ParticipationService.listBreakdownById].
         */
        @MustBeClosed
        fun listBreakdownById(
            marketingEventId: Long
        ): HttpResponseFor<ParticipationListBreakdownByIdPage> =
            listBreakdownById(marketingEventId, ParticipationListBreakdownByIdParams.none())

        /** @see listBreakdownById */
        @MustBeClosed
        fun listBreakdownById(
            marketingEventId: Long,
            params: ParticipationListBreakdownByIdParams =
                ParticipationListBreakdownByIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ParticipationListBreakdownByIdPage> =
            listBreakdownById(
                params.toBuilder().marketingEventId(marketingEventId).build(),
                requestOptions,
            )

        /** @see listBreakdownById */
        @MustBeClosed
        fun listBreakdownById(
            marketingEventId: Long,
            params: ParticipationListBreakdownByIdParams =
                ParticipationListBreakdownByIdParams.none(),
        ): HttpResponseFor<ParticipationListBreakdownByIdPage> =
            listBreakdownById(marketingEventId, params, RequestOptions.none())

        /** @see listBreakdownById */
        @MustBeClosed
        fun listBreakdownById(
            params: ParticipationListBreakdownByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ParticipationListBreakdownByIdPage>

        /** @see listBreakdownById */
        @MustBeClosed
        fun listBreakdownById(
            params: ParticipationListBreakdownByIdParams
        ): HttpResponseFor<ParticipationListBreakdownByIdPage> =
            listBreakdownById(params, RequestOptions.none())

        /** @see listBreakdownById */
        @MustBeClosed
        fun listBreakdownById(
            marketingEventId: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ParticipationListBreakdownByIdPage> =
            listBreakdownById(
                marketingEventId,
                ParticipationListBreakdownByIdParams.none(),
                requestOptions,
            )
    }
}
