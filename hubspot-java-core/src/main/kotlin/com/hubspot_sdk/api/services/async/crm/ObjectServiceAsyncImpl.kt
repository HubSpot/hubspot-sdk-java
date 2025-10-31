// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.crm.ObjectServiceAsync
import com.hubspot_sdk.api.services.async.crm.ObjectServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.objects.AppointmentServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.AppointmentServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.objects.CallServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.CallServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.objects.CartServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.CartServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.objects.CommercePaymentServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.CommercePaymentServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.objects.CommunicationServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.CommunicationServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.objects.CompanyServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.CompanyServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.objects.ContactServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.ContactServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.objects.ContractServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.ContractServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.objects.CourseServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.CourseServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.objects.CustomServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.CustomServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.objects.DealServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.DealServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.objects.DealSplitServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.DealSplitServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.objects.DiscountServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.DiscountServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.objects.EmailServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.EmailServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.objects.FeeServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.FeeServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.objects.FeedbackSubmissionServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.FeedbackSubmissionServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.objects.GoalTargetServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.GoalTargetServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.objects.InvoiceServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.InvoiceServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.objects.LeadServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.LeadServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.objects.LineItemServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.LineItemServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.objects.ListingServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.ListingServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.objects.MeetingServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.MeetingServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.objects.NoteServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.NoteServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.objects.ObjectServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.ObjectServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.objects.OrderServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.OrderServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.objects.PartnerClientServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.PartnerClientServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.objects.PartnerServiceServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.PartnerServiceServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.objects.PostalMailServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.PostalMailServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.objects.ProductServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.ProductServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.objects.QuoteServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.QuoteServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.objects.SchemaServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.SchemaServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.objects.ServiceServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.ServiceServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.objects.TaskServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.TaskServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.objects.TaxServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.TaxServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.objects.TicketServiceAsync
import com.hubspot_sdk.api.services.async.crm.objects.TicketServiceAsyncImpl
import java.util.function.Consumer

class ObjectServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ObjectServiceAsync {

    private val withRawResponse: ObjectServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val appointments: AppointmentServiceAsync by lazy {
        AppointmentServiceAsyncImpl(clientOptions)
    }

    private val calls: CallServiceAsync by lazy { CallServiceAsyncImpl(clientOptions) }

    private val carts: CartServiceAsync by lazy { CartServiceAsyncImpl(clientOptions) }

    private val commercePayments: CommercePaymentServiceAsync by lazy {
        CommercePaymentServiceAsyncImpl(clientOptions)
    }

    private val communications: CommunicationServiceAsync by lazy {
        CommunicationServiceAsyncImpl(clientOptions)
    }

    private val companies: CompanyServiceAsync by lazy { CompanyServiceAsyncImpl(clientOptions) }

    private val contacts: ContactServiceAsync by lazy { ContactServiceAsyncImpl(clientOptions) }

    private val contracts: ContractServiceAsync by lazy { ContractServiceAsyncImpl(clientOptions) }

    private val courses: CourseServiceAsync by lazy { CourseServiceAsyncImpl(clientOptions) }

    private val custom: CustomServiceAsync by lazy { CustomServiceAsyncImpl(clientOptions) }

    private val dealSplits: DealSplitServiceAsync by lazy {
        DealSplitServiceAsyncImpl(clientOptions)
    }

    private val deals: DealServiceAsync by lazy { DealServiceAsyncImpl(clientOptions) }

    private val discounts: DiscountServiceAsync by lazy { DiscountServiceAsyncImpl(clientOptions) }

    private val emails: EmailServiceAsync by lazy { EmailServiceAsyncImpl(clientOptions) }

    private val feedbackSubmissions: FeedbackSubmissionServiceAsync by lazy {
        FeedbackSubmissionServiceAsyncImpl(clientOptions)
    }

    private val fees: FeeServiceAsync by lazy { FeeServiceAsyncImpl(clientOptions) }

    private val goalTargets: GoalTargetServiceAsync by lazy {
        GoalTargetServiceAsyncImpl(clientOptions)
    }

    private val invoices: InvoiceServiceAsync by lazy { InvoiceServiceAsyncImpl(clientOptions) }

    private val leads: LeadServiceAsync by lazy { LeadServiceAsyncImpl(clientOptions) }

    private val lineItems: LineItemServiceAsync by lazy { LineItemServiceAsyncImpl(clientOptions) }

    private val listings: ListingServiceAsync by lazy { ListingServiceAsyncImpl(clientOptions) }

    private val meetings: MeetingServiceAsync by lazy { MeetingServiceAsyncImpl(clientOptions) }

    private val notes: NoteServiceAsync by lazy { NoteServiceAsyncImpl(clientOptions) }

    private val objects: ObjectServiceAsync by lazy { ObjectServiceAsyncImpl(clientOptions) }

    private val orders: OrderServiceAsync by lazy { OrderServiceAsyncImpl(clientOptions) }

    private val partnerClients: PartnerClientServiceAsync by lazy {
        PartnerClientServiceAsyncImpl(clientOptions)
    }

    private val partnerServices: PartnerServiceServiceAsync by lazy {
        PartnerServiceServiceAsyncImpl(clientOptions)
    }

    private val postalMail: PostalMailServiceAsync by lazy {
        PostalMailServiceAsyncImpl(clientOptions)
    }

    private val products: ProductServiceAsync by lazy { ProductServiceAsyncImpl(clientOptions) }

    private val quotes: QuoteServiceAsync by lazy { QuoteServiceAsyncImpl(clientOptions) }

    private val schemas: SchemaServiceAsync by lazy { SchemaServiceAsyncImpl(clientOptions) }

    private val services: ServiceServiceAsync by lazy { ServiceServiceAsyncImpl(clientOptions) }

    private val tasks: TaskServiceAsync by lazy { TaskServiceAsyncImpl(clientOptions) }

    private val taxes: TaxServiceAsync by lazy { TaxServiceAsyncImpl(clientOptions) }

    private val tickets: TicketServiceAsync by lazy { TicketServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ObjectServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ObjectServiceAsync =
        ObjectServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun appointments(): AppointmentServiceAsync = appointments

    override fun calls(): CallServiceAsync = calls

    override fun carts(): CartServiceAsync = carts

    override fun commercePayments(): CommercePaymentServiceAsync = commercePayments

    override fun communications(): CommunicationServiceAsync = communications

    override fun companies(): CompanyServiceAsync = companies

    override fun contacts(): ContactServiceAsync = contacts

    override fun contracts(): ContractServiceAsync = contracts

    override fun courses(): CourseServiceAsync = courses

    override fun custom(): CustomServiceAsync = custom

    override fun dealSplits(): DealSplitServiceAsync = dealSplits

    override fun deals(): DealServiceAsync = deals

    override fun discounts(): DiscountServiceAsync = discounts

    override fun emails(): EmailServiceAsync = emails

    override fun feedbackSubmissions(): FeedbackSubmissionServiceAsync = feedbackSubmissions

    override fun fees(): FeeServiceAsync = fees

    override fun goalTargets(): GoalTargetServiceAsync = goalTargets

    override fun invoices(): InvoiceServiceAsync = invoices

    override fun leads(): LeadServiceAsync = leads

    override fun lineItems(): LineItemServiceAsync = lineItems

    override fun listings(): ListingServiceAsync = listings

    override fun meetings(): MeetingServiceAsync = meetings

    override fun notes(): NoteServiceAsync = notes

    override fun objects(): ObjectServiceAsync = objects

    override fun orders(): OrderServiceAsync = orders

    override fun partnerClients(): PartnerClientServiceAsync = partnerClients

    override fun partnerServices(): PartnerServiceServiceAsync = partnerServices

    override fun postalMail(): PostalMailServiceAsync = postalMail

    override fun products(): ProductServiceAsync = products

    override fun quotes(): QuoteServiceAsync = quotes

    override fun schemas(): SchemaServiceAsync = schemas

    override fun services(): ServiceServiceAsync = services

    override fun tasks(): TaskServiceAsync = tasks

    override fun taxes(): TaxServiceAsync = taxes

    override fun tickets(): TicketServiceAsync = tickets

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ObjectServiceAsync.WithRawResponse {

        private val appointments: AppointmentServiceAsync.WithRawResponse by lazy {
            AppointmentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val calls: CallServiceAsync.WithRawResponse by lazy {
            CallServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val carts: CartServiceAsync.WithRawResponse by lazy {
            CartServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val commercePayments: CommercePaymentServiceAsync.WithRawResponse by lazy {
            CommercePaymentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val communications: CommunicationServiceAsync.WithRawResponse by lazy {
            CommunicationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val companies: CompanyServiceAsync.WithRawResponse by lazy {
            CompanyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val contacts: ContactServiceAsync.WithRawResponse by lazy {
            ContactServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val contracts: ContractServiceAsync.WithRawResponse by lazy {
            ContractServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val courses: CourseServiceAsync.WithRawResponse by lazy {
            CourseServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val custom: CustomServiceAsync.WithRawResponse by lazy {
            CustomServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val dealSplits: DealSplitServiceAsync.WithRawResponse by lazy {
            DealSplitServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val deals: DealServiceAsync.WithRawResponse by lazy {
            DealServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val discounts: DiscountServiceAsync.WithRawResponse by lazy {
            DiscountServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val emails: EmailServiceAsync.WithRawResponse by lazy {
            EmailServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val feedbackSubmissions: FeedbackSubmissionServiceAsync.WithRawResponse by lazy {
            FeedbackSubmissionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val fees: FeeServiceAsync.WithRawResponse by lazy {
            FeeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val goalTargets: GoalTargetServiceAsync.WithRawResponse by lazy {
            GoalTargetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val invoices: InvoiceServiceAsync.WithRawResponse by lazy {
            InvoiceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val leads: LeadServiceAsync.WithRawResponse by lazy {
            LeadServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val lineItems: LineItemServiceAsync.WithRawResponse by lazy {
            LineItemServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val listings: ListingServiceAsync.WithRawResponse by lazy {
            ListingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val meetings: MeetingServiceAsync.WithRawResponse by lazy {
            MeetingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val notes: NoteServiceAsync.WithRawResponse by lazy {
            NoteServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val objects: ObjectServiceAsync.WithRawResponse by lazy {
            ObjectServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val orders: OrderServiceAsync.WithRawResponse by lazy {
            OrderServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val partnerClients: PartnerClientServiceAsync.WithRawResponse by lazy {
            PartnerClientServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val partnerServices: PartnerServiceServiceAsync.WithRawResponse by lazy {
            PartnerServiceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val postalMail: PostalMailServiceAsync.WithRawResponse by lazy {
            PostalMailServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val products: ProductServiceAsync.WithRawResponse by lazy {
            ProductServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val quotes: QuoteServiceAsync.WithRawResponse by lazy {
            QuoteServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val schemas: SchemaServiceAsync.WithRawResponse by lazy {
            SchemaServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val services: ServiceServiceAsync.WithRawResponse by lazy {
            ServiceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val tasks: TaskServiceAsync.WithRawResponse by lazy {
            TaskServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val taxes: TaxServiceAsync.WithRawResponse by lazy {
            TaxServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val tickets: TicketServiceAsync.WithRawResponse by lazy {
            TicketServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ObjectServiceAsync.WithRawResponse =
            ObjectServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun appointments(): AppointmentServiceAsync.WithRawResponse = appointments

        override fun calls(): CallServiceAsync.WithRawResponse = calls

        override fun carts(): CartServiceAsync.WithRawResponse = carts

        override fun commercePayments(): CommercePaymentServiceAsync.WithRawResponse =
            commercePayments

        override fun communications(): CommunicationServiceAsync.WithRawResponse = communications

        override fun companies(): CompanyServiceAsync.WithRawResponse = companies

        override fun contacts(): ContactServiceAsync.WithRawResponse = contacts

        override fun contracts(): ContractServiceAsync.WithRawResponse = contracts

        override fun courses(): CourseServiceAsync.WithRawResponse = courses

        override fun custom(): CustomServiceAsync.WithRawResponse = custom

        override fun dealSplits(): DealSplitServiceAsync.WithRawResponse = dealSplits

        override fun deals(): DealServiceAsync.WithRawResponse = deals

        override fun discounts(): DiscountServiceAsync.WithRawResponse = discounts

        override fun emails(): EmailServiceAsync.WithRawResponse = emails

        override fun feedbackSubmissions(): FeedbackSubmissionServiceAsync.WithRawResponse =
            feedbackSubmissions

        override fun fees(): FeeServiceAsync.WithRawResponse = fees

        override fun goalTargets(): GoalTargetServiceAsync.WithRawResponse = goalTargets

        override fun invoices(): InvoiceServiceAsync.WithRawResponse = invoices

        override fun leads(): LeadServiceAsync.WithRawResponse = leads

        override fun lineItems(): LineItemServiceAsync.WithRawResponse = lineItems

        override fun listings(): ListingServiceAsync.WithRawResponse = listings

        override fun meetings(): MeetingServiceAsync.WithRawResponse = meetings

        override fun notes(): NoteServiceAsync.WithRawResponse = notes

        override fun objects(): ObjectServiceAsync.WithRawResponse = objects

        override fun orders(): OrderServiceAsync.WithRawResponse = orders

        override fun partnerClients(): PartnerClientServiceAsync.WithRawResponse = partnerClients

        override fun partnerServices(): PartnerServiceServiceAsync.WithRawResponse = partnerServices

        override fun postalMail(): PostalMailServiceAsync.WithRawResponse = postalMail

        override fun products(): ProductServiceAsync.WithRawResponse = products

        override fun quotes(): QuoteServiceAsync.WithRawResponse = quotes

        override fun schemas(): SchemaServiceAsync.WithRawResponse = schemas

        override fun services(): ServiceServiceAsync.WithRawResponse = services

        override fun tasks(): TaskServiceAsync.WithRawResponse = tasks

        override fun taxes(): TaxServiceAsync.WithRawResponse = taxes

        override fun tickets(): TicketServiceAsync.WithRawResponse = tickets
    }
}
